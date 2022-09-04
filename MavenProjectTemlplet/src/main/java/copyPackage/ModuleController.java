package copyPackage;

@Controller
@RequestMapping(value="/moduleName/")
public class ModuleController {

	@Autowired
	*Project*ServiceImpl service;
	
	@RequestMapping(value = "modulePageName")
	public String modulePageName () throws Exception {
		
		Logic
		
		return "pagingPath/modulePageName";
	}
	
}