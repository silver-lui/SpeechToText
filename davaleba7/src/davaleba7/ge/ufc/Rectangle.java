package davaleba7.ge.ufc;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
	private double length;
	private double height;
	public static List<Rectangle> recs = new ArrayList<Rectangle>();
	
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getHeigth() {
		return this.height;
	}
	
	public double getArea() {
		return length * height;
	}
	
	public double getPer() {
		return this.height + this.length;
	}
	
	public boolean equals(Rectangle rec) {
		if (rec.getHeigth() == this.getHeigth() && rec.getLength() == this.getLength())
			return true;
		return false;
	}
	
	public void checkRec(Rectangle rec) {
		if (rec.getArea() == this.getArea())
			System.out.println("Is Equal");
		else if (rec.getArea() > this.getArea())
			System.out.println("Is Less");
		else System.out.println("Is More");
	}
	
	public void setWithPer(List<Rectangle> recs) {
		List<Rectangle> recs2 = new ArrayList<Rectangle>();
		
		for (int i = 1; i < recs.size(); i++) {
			Rectangle rec1 = recs.get(i-1);
			Rectangle rec2 = recs.get(i);
			
			if (rec1.getPer() < rec2.getPer()) {
				recs2.add(rec1);
				recs.remove(rec1);
				i = 1;
			}else {
				recs2.add(rec2);
				recs.remove(rec2);
				i = 1;
			}
		}
		
		this.recs = recs2;
	}
	
	public void Sort(List<Rectangle> recs){
		List<Rectangle> recs2 = new ArrayList<Rectangle>();
		
		for (int i = 1; i < recs.size(); i++) {
			Rectangle rec1 = recs.get(i-1);
			Rectangle rec2 = recs.get(i);
			
			if (rec1.getArea() < rec2.getArea()) {
				recs2.add(rec1);
				recs.remove(rec1);
				i = 1;
			}else {
				recs2.add(rec2);
				recs.remove(rec2);
				i = 1;
			}
		}
		
		this.recs = recs2;
	}
	
	public void Revers(List<Rectangle> recs) {
		List<Rectangle> recs2 = new ArrayList<Rectangle>();
		
		for (int i = 1; i < recs.size(); i++) {
			Rectangle rec1 = recs.get(i-1);
			Rectangle rec2 = recs.get(i);
			
			if (rec1.getArea() < rec2.getArea()) {
				recs2.add(rec2);
				recs.remove(rec2);
				i = 1;
			}else {
				recs2.add(rec1);
				recs.remove(rec1);
				i = 1;
			}
		}
	}
	
	public List<Rectangle> regularSortedRecArray(List<Rectangle> recs){
		Sort(recs);
		int count = 0;
		List<Rectangle> regularArray = new ArrayList<Rectangle>();
		
		for (int i = 0; i < recs.size(); i++) {
			for (int j = 0; j < recs.size(); j++) 
				if (recs.get(i).getPer() == recs.get(j).getPer())
					count++;
			if (count <= 1) {
				regularArray.add(recs.get(i));
				count = 0;
			}
		}
		
		return regularArray;
	}
	
	public List<Rectangle> regularRecArray(List<Rectangle> recs){
		int count = 0;
		List<Rectangle> regularArray = new ArrayList<Rectangle>();
		
		for (int i = 0; i < recs.size(); i++) {
			for (int j = 0; j < recs.size(); j++) 
				if (recs.get(i).getPer() == recs.get(j).getPer())
					count++;
			if (count <= 1) {
				regularArray.add(recs.get(i));
				count = 0;
			}
		}
		
		return regularArray;
	}
	
	
}
