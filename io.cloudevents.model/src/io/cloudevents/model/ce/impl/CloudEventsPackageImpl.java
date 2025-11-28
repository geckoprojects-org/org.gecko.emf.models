/**
 */
package io.cloudevents.model.ce.impl;

import io.cloudevents.model.ce.CloudEvent;
import io.cloudevents.model.ce.CloudEventsFactory;
import io.cloudevents.model.ce.CloudEventsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudEventsPackageImpl extends EPackageImpl implements CloudEventsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionAttributeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see io.cloudevents.model.ce.CloudEventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CloudEventsPackageImpl() {
		super(eNS_URI, CloudEventsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CloudEventsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CloudEventsPackage init() {
		if (isInited) return (CloudEventsPackage)EPackage.Registry.INSTANCE.getEPackage(CloudEventsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCloudEventsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CloudEventsPackageImpl theCloudEventsPackage = registeredCloudEventsPackage instanceof CloudEventsPackageImpl ? (CloudEventsPackageImpl)registeredCloudEventsPackage : new CloudEventsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCloudEventsPackage.createPackageContents();

		// Initialize created meta-data
		theCloudEventsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCloudEventsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CloudEventsPackage.eNS_URI, theCloudEventsPackage);
		return theCloudEventsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudEvent() {
		return cloudEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_EventId() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_Source() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_SpecVersion() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_Type() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_Datacontenttype() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_Dataschema() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_Subject() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudEvent_Time() {
		return (EAttribute)cloudEventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCloudEvent_Extensions() {
		return (EReference)cloudEventEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCloudEvent_Data() {
		return (EReference)cloudEventEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionAttribute() {
		return extensionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionAttribute_Key() {
		return (EAttribute)extensionAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionAttribute_Value() {
		return (EAttribute)extensionAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudEventsFactory getCloudEventsFactory() {
		return (CloudEventsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudEventEClass = createEClass(CLOUD_EVENT);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__EVENT_ID);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__SOURCE);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__SPEC_VERSION);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__TYPE);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__DATACONTENTTYPE);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__DATASCHEMA);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__SUBJECT);
		createEAttribute(cloudEventEClass, CLOUD_EVENT__TIME);
		createEReference(cloudEventEClass, CLOUD_EVENT__EXTENSIONS);
		createEReference(cloudEventEClass, CLOUD_EVENT__DATA);

		extensionAttributeEClass = createEClass(EXTENSION_ATTRIBUTE);
		createEAttribute(extensionAttributeEClass, EXTENSION_ATTRIBUTE__KEY);
		createEAttribute(extensionAttributeEClass, EXTENSION_ATTRIBUTE__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudEventEClass, CloudEvent.class, "CloudEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudEvent_EventId(), ecorePackage.getEString(), "eventId", null, 1, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudEvent_SpecVersion(), ecorePackage.getEString(), "specVersion", "1.0", 1, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudEvent_Type(), ecorePackage.getEString(), "type", null, 1, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudEvent_Datacontenttype(), ecorePackage.getEString(), "datacontenttype", null, 0, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudEvent_Dataschema(), ecorePackage.getEString(), "dataschema", null, 0, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudEvent_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudEvent_Time(), ecorePackage.getEDate(), "time", null, 0, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudEvent_Extensions(), this.getExtensionAttribute(), null, "extensions", null, 0, -1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudEvent_Data(), ecorePackage.getEObject(), null, "data", null, 0, 1, CloudEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionAttributeEClass, Map.Entry.class, "ExtensionAttribute", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionAttribute_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Version
		createVersionAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Version</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createVersionAnnotations() {
		String source = "Version";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "value", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "complianceLevel", "17.0",
			   "oSGiCompatible", "true",
			   "basePackage", "io.cloudevents.model",
			   "resource", "XMI"
		   });
		addAnnotation
		  (cloudEventEClass,
		   source,
		   new String[] {
			   "documentation", "Representation of an event according to CloudEvents Spec v1.0"
		   });
		addAnnotation
		  (getCloudEvent_EventId(),
		   source,
		   new String[] {
			   "documentation", "REQUIRED. Identifies the event. Producers MUST ensure that source + id is unique for each distinct event."
		   });
		addAnnotation
		  (getCloudEvent_Source(),
		   source,
		   new String[] {
			   "documentation", "REQUIRED. Identifies the context in which an event happened. URI-reference."
		   });
		addAnnotation
		  (getCloudEvent_SpecVersion(),
		   source,
		   new String[] {
			   "documentation", "REQUIRED. The version of the CloudEvents specification which the event uses."
		   });
		addAnnotation
		  (getCloudEvent_Type(),
		   source,
		   new String[] {
			   "documentation", "REQUIRED. This attribute contains a value describing the type of event related to the originating occurrence."
		   });
		addAnnotation
		  (getCloudEvent_Datacontenttype(),
		   source,
		   new String[] {
			   "documentation", "OPTIONAL. Content type of the data value. Must adhere to RFC 2046 format."
		   });
		addAnnotation
		  (getCloudEvent_Dataschema(),
		   source,
		   new String[] {
			   "documentation", "OPTIONAL. Identifies the schema that data adheres to."
		   });
		addAnnotation
		  (getCloudEvent_Subject(),
		   source,
		   new String[] {
			   "documentation", "OPTIONAL. Describes the subject of the event in the context of the event producer (identified by source)."
		   });
		addAnnotation
		  (getCloudEvent_Time(),
		   source,
		   new String[] {
			   "documentation", "OPTIONAL. Timestamp of when the occurrence happened. Must adhere to RFC 3339."
		   });
		addAnnotation
		  (getCloudEvent_Extensions(),
		   source,
		   new String[] {
			   "documentation", "OPTIONAL. Extension attributes for custom fields not in the spec."
		   });
		addAnnotation
		  (getCloudEvent_Data(),
		   source,
		   new String[] {
			   "documentation", "OPTIONAL. The event payload."
		   });
	}

} //CloudEventsPackageImpl
