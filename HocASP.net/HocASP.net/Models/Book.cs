using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace HocASP.net.Models
{
    public class Book
    {
        private int id;
        private string title;
        private string author;
        private string img_cover;

        public Book()
        {

        }

        public Book(int id, string title, string author, string img_cover)
        {
            this.id = id;
            this.title = title;
            this.author = author;
            this.img_cover = img_cover;
           
        }
        


        public int Id
        {
            get { return this.id; }
        }
        public string Title
        {
            get { return this.title; }
        }
        public string Author
        {
            get { return this.author; }
        }
        public string ImgCover
        {
            get { return this.img_cover; }
        }
    }
}