package cn.crap.framework.base;

import java.util.List;
import java.util.Map;
import cn.crap.utils.Page;

public interface IBaseService<T extends BaseModel> {

	/**
	 * 保存对象
	 * */
	public T save(T model);

	public void update(T model);
	/**
	 * 批量保存对象
	 * */
	public List<T> saveAll(List<T> list);

	/**
	 * 根据主键删除
	 * */
	public void deleteByPK(String id);

	/**
	 * 根据示例对象删除
	 * */
	public void delete(T model);

	/**
	 * 根据示例对象集合删除
	 * */
	public void deleteAll(List<T> list);

	/**
	 * 根据主键获取对象
	 * */
	public T get(String id);

	/**
	 * 根据示例对象获取对象列表
	 * */
	public List<T> findByExample(T model);

	/**
	 * 根据示例对象获取对象列表
	 * */
	public List<T> loadAll(T model);

	/**
	 * 根据查询条件Map集合查询数据集合
	 * @param map 查询条件Map集合
	 * @param page 分页参数
	 * @param order 排序规则（为空则按创建时间降序排列）
	 */
	public List<T> findByMap(Map<String, Object> map,
			Page pageBean, String order);
	
	/**
	 * 根据查询条件Map集合查询总数量
	 * @param map
	 * @return
	 */
	public int getCount(Map<String, Object> map);

	/**
	 * 根据Hql语句查询
	 * @param Hql
	 * @return
	 */
	public List<T> findByHql(String Hql);

	

}
