
/*
 * �o�ӽd�ҬO���ѵ��U��b���gAssignment#1�ɨϥ�
 */
import java.util.Random;

class CCUStudent {
	String name, id;
	double score;

	CCUStudent() {
	}// important

	CCUStudent(String _name, String _id, double _score) {
		this.name = _name;
		this.id = _id;
		this.score = _score;
	}

	String getName() {
		return this.name;
	}

	String getId() {
		return this.id;
	}

	double getScore() {
		return this.score;
	}

	// �й��յ��ѤU��function
	public String toString() {
		return "[" + this.name + "] " + this.id + " / Score=" + String.format("%.2f", this.score);
	}
}

public class HW1_conference {
	public static void main(String[] args) {
		Random r = new Random();
		CCUStudent s1 = new CCUStudent("ChenWei", "604530012", 87.5);
		System.out.println(s1);
		System.out.println("====�H�U�ѵ{���۰ʲ��;ǥ͸��====");
		CCUStudent[] data = new CCUStudent[30];// size = 100
		for (int i = 0; i < data.length; i++) {
			data[i] = new CCUStudent("Stu_" + String.format("%03d", i + 1), "604530" + String.format("%03d", i + 1),
					Math.round((r.nextDouble() * 50 + 30) * 100) / 100.0);

		}

		for (CCUStudent temp : data) {
			System.out.println(temp);
		}

		System.out.println("====�H�W�ѵ{���۰ʲ��;ǥ͸��====");
		System.out.println("===���o�Ҧ��ǥͤ����Z�íp�⥭��===");
		double avg = 0.0;
		for (CCUStudent temp : data) {
			avg += temp.getScore();
		}
		System.out.println("���Z�`���� = " + String.format("%.2f", avg) + " �� | �`�H�� = " + data.length + " �H | ���� = "
				+ String.format("%.2f", avg / data.length) + " ��");
	}
}
