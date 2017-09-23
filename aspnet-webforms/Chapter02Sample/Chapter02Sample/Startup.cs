using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(Chapter02Sample.Startup))]
namespace Chapter02Sample
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
