package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	public InsaImpl() {
		System.out.println("InsaImpl �⺻������");
	}
	//Constructor Injection���� MemberDAO��ü�� ���Թޱ� ���� �ʿ�
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImple �Ű�����1�� ������");
	}
	//setter Injection���� MemberDAO��ü�� ���Թޱ� ���� setter�޼ҵ带 �غ�
	public MemberDAO getDao() {
		return dao;
	}
	public void setDao(MemberDAO dao) {
		System.out.println("setter ȣ��");
		this.dao = dao;
	}
	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}
	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}
}