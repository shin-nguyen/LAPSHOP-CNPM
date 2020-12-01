using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LapShopCNPM.Areas.admin.Controllers
{
    public class OrdersController : Controller
    {
        // GET: admin/Orders
        public ActionResult Index()
        {
            return View();
        }
        public ActionResult ProcessOrder()
        {
            return View();
        }
    }
}