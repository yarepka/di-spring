# Spring bean lifecycle.

<h4>Bean initialization process:</h4>
<ol>
    <li><b>Instantiate</b> - <i>constructer is called.</i></li>
    <li><b>Populate Properties</b> - <i>dependencies are injected</i></li>
    <li><b>Call setBeanName of BeanNameAware interface</b> - <i>set the bean name.</i></li>
    <li><b>Call setBeanFactory of BeanFactoryAware interface</b> - <i>set the bean factory.</i></li>
    <li><b>Call setApplicationContext of ApplicationContextAware interface</b> - <i>set the application context.</i></li>
    <li><b>Preinitialization(Bean PostProcessors)</b><ul><li><b>postProcessBeforeInitialization</b> - <i>called before bean initialization method.</i></ul></li>
    <li><b>afterPropertiesSet of Initializing Beans.</b></li>
    <li><b>Custom Init Method.</b></li>
    <li><b>Post Initialization(BeanPostProcessors)</b><ul><li><b>postProcessAfterInitialization</b> - <i>called after bean initialization.</i></li></ul></li>
    <li><b>Bean Ready to Use.</b></li>
</ol>

<h4>Bean termination process:</h4>
<ol>
    <li><b>ContainerShutdown signal.</b></li>
    <li><b>Disposable Bean's destroy().</b></li>
    <li><b>Call Custom Destroy Method.</b></li>
    <li><b>Bean TERMINATED - end of bean lifecycle.</b></li>
</ol>


<h4>Callback interfaces:<h4>

- <b>InitializingBean</b> - <i><b>afterPropertiesSet()</b> method called after properties are set.</i>

- <b>DisposableBean</b> - <i><b>destroy()</b> method called during bean destruction in shutdown.</i>

<h4>Life Cycle Annotations</h4>

This annotations are used to hook into the bean life cycle.

- <b>@PostConstruct</b> - <i>annotated methods will be called after the bean has been constructed, but before it's returned to the requesting object.</i>

- <b>@PreDestroy</b> - <i>is called just before the bean is destroyed by the container</i>

<h4>Bean Post Processors:</h4>

Allows you to tap into the Spring context life cycle and interact with beans as they are processed.

To do that, you need to implement BeanPostProcessor interface, which has two methods:

- <b>postProcessBeforeInitialization</b> - <i>called before bean initialization method.</i>

- <b>postProcessAfterInitialization</b> - <i>called after bean initialization.</i>


<h3>Spring has over 14 'Aware' interfaces are used to access the Spring Framework infrastructure. Largely used within the framework. Rarely used by Spring developers.</h3>
<img src="http://www.daxiongmao.eu/wiki/images/2/26/Spring_bean_creation_aware_interfaces.png" alt="aware interfaces">
