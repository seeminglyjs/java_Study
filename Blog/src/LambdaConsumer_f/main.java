package LambdaConsumer_f;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t ->{
			System.out.println(t +"�̴�.");
		};
		//�Ű����� �ް� ���ϰ��� ���� �������̽�
		consumer.accept("king");
		
		BiConsumer<String, Integer> bis = (a, b)->{
			System.out.println("�̸��� " + a + "���̴� " + b);
		};
		bis.accept("king", 25);
		//�ΰ��� ���׸� Ÿ���� �޴� �������̽� ���������� ���ϰ��� ����.
	}

}
