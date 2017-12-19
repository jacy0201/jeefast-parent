package cn.jeefast.modules.platform.controller;

import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import cn.jeefast.common.base.BaseController;
import cn.jeefast.common.utils.Query;
import cn.jeefast.common.utils.R;
import cn.jeefast.modules.platform.entity.PfNotice;
import cn.jeefast.modules.platform.service.PfNoticeService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author theodo
 * @since 2017-12-18
 */
@RestController
@RequestMapping("/platform/pfNotice")
public class PfNoticeController extends BaseController {
	@Autowired
	private PfNoticeService pfNoticeService;
	
	/**
	 * 所有系统通知列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("platform:notice:list")
	public R list(@RequestParam Map<String, Object> params){
		Query query = new Query(params);
		Page<PfNotice> pageUtil = new Page<PfNotice>(query.getPage(), query.getLimit());
		Page<PfNotice> page = pfNoticeService.queryPageList(pageUtil,query);
		return R.ok().put("page", page);
	}
	
	
}
