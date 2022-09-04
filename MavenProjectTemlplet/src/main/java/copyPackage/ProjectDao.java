package copyPackage;

@Repository
public class *Modtfy*Dao {
	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "project의_Mapper_경로";
	
	public List<프로젝트의_DTO> selectList(){ return sqlSession.selectList(namespace + ".Mapper_쿼리문_로직_이름", ""); }
}
