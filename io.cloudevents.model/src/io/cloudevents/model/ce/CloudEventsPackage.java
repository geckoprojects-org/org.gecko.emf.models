/*
 */
package io.cloudevents.model.ce;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.cloudevents.model.ce.CloudEventsFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='17.0' oSGiCompatible='true' basePackage='io.cloudevents.model' resource='XMI'"
 * @generated
 */
@ProviderType
@EPackage(uri = CloudEventsPackage.eNS_URI, genModel = "/model/cloudevents.genmodel", genModelSourceLocations = {"model/cloudevents.genmodel","io.cloudevents.model/model/cloudevents.genmodel"}, ecore="/model/cloudevents.ecore", ecoreSourceLocations="/model/cloudevents.ecore")
public interface CloudEventsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ce";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://cloudevents.io/1.0.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ce";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudEventsPackage eINSTANCE = io.cloudevents.model.ce.impl.CloudEventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.cloudevents.model.ce.impl.CloudEventImpl <em>Cloud Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.cloudevents.model.ce.impl.CloudEventImpl
	 * @see io.cloudevents.model.ce.impl.CloudEventsPackageImpl#getCloudEvent()
	 * @generated
	 */
	int CLOUD_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__EVENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Spec Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__SPEC_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Datacontenttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__DATACONTENTTYPE = 4;

	/**
	 * The feature id for the '<em><b>Dataschema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__DATASCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__SUBJECT = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__TIME = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__EXTENSIONS = 8;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT__DATA = 9;

	/**
	 * The number of structural features of the '<em>Cloud Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Cloud Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.cloudevents.model.ce.impl.ExtensionAttributeImpl <em>Extension Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.cloudevents.model.ce.impl.ExtensionAttributeImpl
	 * @see io.cloudevents.model.ce.impl.CloudEventsPackageImpl#getExtensionAttribute()
	 * @generated
	 */
	int EXTENSION_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Extension Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extension Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link io.cloudevents.model.ce.CloudEvent <em>Cloud Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Event</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent
	 * @generated
	 */
	EClass getCloudEvent();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getEventId <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getEventId()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_EventId();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getSource()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getSpecVersion <em>Spec Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec Version</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getSpecVersion()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_SpecVersion();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getType()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getDatacontenttype <em>Datacontenttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacontenttype</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getDatacontenttype()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_Datacontenttype();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getDataschema <em>Dataschema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataschema</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getDataschema()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_Dataschema();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getSubject()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_Subject();

	/**
	 * Returns the meta object for the attribute '{@link io.cloudevents.model.ce.CloudEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getTime()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EAttribute getCloudEvent_Time();

	/**
	 * Returns the meta object for the map '{@link io.cloudevents.model.ce.CloudEvent#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Extensions</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getExtensions()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EReference getCloudEvent_Extensions();

	/**
	 * Returns the meta object for the containment reference '{@link io.cloudevents.model.ce.CloudEvent#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see io.cloudevents.model.ce.CloudEvent#getData()
	 * @see #getCloudEvent()
	 * @generated
	 */
	EReference getCloudEvent_Data();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Extension Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Attribute</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getExtensionAttribute();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExtensionAttribute()
	 * @generated
	 */
	EAttribute getExtensionAttribute_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExtensionAttribute()
	 * @generated
	 */
	EAttribute getExtensionAttribute_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudEventsFactory getCloudEventsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.cloudevents.model.ce.impl.CloudEventImpl <em>Cloud Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.cloudevents.model.ce.impl.CloudEventImpl
		 * @see io.cloudevents.model.ce.impl.CloudEventsPackageImpl#getCloudEvent()
		 * @generated
		 */
		EClass CLOUD_EVENT = eINSTANCE.getCloudEvent();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__EVENT_ID = eINSTANCE.getCloudEvent_EventId();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__SOURCE = eINSTANCE.getCloudEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Spec Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__SPEC_VERSION = eINSTANCE.getCloudEvent_SpecVersion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__TYPE = eINSTANCE.getCloudEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Datacontenttype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__DATACONTENTTYPE = eINSTANCE.getCloudEvent_Datacontenttype();

		/**
		 * The meta object literal for the '<em><b>Dataschema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__DATASCHEMA = eINSTANCE.getCloudEvent_Dataschema();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__SUBJECT = eINSTANCE.getCloudEvent_Subject();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_EVENT__TIME = eINSTANCE.getCloudEvent_Time();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_EVENT__EXTENSIONS = eINSTANCE.getCloudEvent_Extensions();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_EVENT__DATA = eINSTANCE.getCloudEvent_Data();

		/**
		 * The meta object literal for the '{@link io.cloudevents.model.ce.impl.ExtensionAttributeImpl <em>Extension Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.cloudevents.model.ce.impl.ExtensionAttributeImpl
		 * @see io.cloudevents.model.ce.impl.CloudEventsPackageImpl#getExtensionAttribute()
		 * @generated
		 */
		EClass EXTENSION_ATTRIBUTE = eINSTANCE.getExtensionAttribute();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ATTRIBUTE__KEY = eINSTANCE.getExtensionAttribute_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ATTRIBUTE__VALUE = eINSTANCE.getExtensionAttribute_Value();

	}

} //CloudEventsPackage
