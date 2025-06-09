import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import renshibiangeng from '@/views/modules/renshibiangeng/list'
    import yuangongkaohedengji from '@/views/modules/yuangongkaohedengji/list'
    import yuangong from '@/views/modules/yuangong/list'
    import xiujiashenqing from '@/views/modules/xiujiashenqing/list'
    import yuangonggongzi from '@/views/modules/yuangonggongzi/list'
    import yuangongkaoqinjilu from '@/views/modules/yuangongkaoqinjilu/list'
    import kaohebiaozhun from '@/views/modules/kaohebiaozhun/list'
    import kaohejieguo from '@/views/modules/kaohejieguo/list'
    import queqinkouqianbiaozhun from '@/views/modules/queqinkouqianbiaozhun/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/renshibiangeng',
        name: '人事变更',
        component: renshibiangeng
      }
      ,{
	path: '/yuangongkaohedengji',
        name: '员工考核登记',
        component: yuangongkaohedengji
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/xiujiashenqing',
        name: '休假申请',
        component: xiujiashenqing
      }
      ,{
	path: '/yuangonggongzi',
        name: '员工工资',
        component: yuangonggongzi
      }
      ,{
	path: '/yuangongkaoqinjilu',
        name: '员工考勤记录',
        component: yuangongkaoqinjilu
      }
      ,{
	path: '/kaohebiaozhun',
        name: '考核标准',
        component: kaohebiaozhun
      }
      ,{
	path: '/kaohejieguo',
        name: '考核结果',
        component: kaohejieguo
      }
      ,{
	path: '/queqinkouqianbiaozhun',
        name: '缺勤扣钱标准',
        component: queqinkouqianbiaozhun
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
