using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LapShopCNPM.Areas.admin.Controllers
{
    public class ProductController : Controller
    {
        // GET: admin/Product
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult ProductInfo()
        {
            return View();
        }

        public ActionResult AddProduct()
        {
            return View();
        }
    }
}