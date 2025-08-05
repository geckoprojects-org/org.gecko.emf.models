/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.ogc;


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
 * @see net.opengis.ogc.OGCExceptionsFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = OGCExceptionsPackage.eNS_URI, genModel = "/model/ogc-exceptions.genmodel", genModelSourceLocations = {"model/ogc-exceptions.genmodel","net.opengis.ogc/model/ogc-exceptions.genmodel"}, ecore="/model/ogc-exceptions.ecore", ecoreSourceLocations="/model/ogc-exceptions.ecore")
public interface OGCExceptionsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ogc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/ogc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ogc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OGCExceptionsPackage eINSTANCE = net.opengis.ogc.impl.OGCExceptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.DocumentRootImpl
	 * @see net.opengis.ogc.impl.OGCExceptionsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Service Exception Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_EXCEPTION_REPORT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.ServiceExceptionReportTypeImpl <em>Service Exception Report Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.ServiceExceptionReportTypeImpl
	 * @see net.opengis.ogc.impl.OGCExceptionsPackageImpl#getServiceExceptionReportType()
	 * @generated
	 */
	int SERVICE_EXCEPTION_REPORT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Service Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_REPORT_TYPE__SERVICE_EXCEPTION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_REPORT_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Service Exception Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_REPORT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Exception Report Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_REPORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.ServiceExceptionTypeImpl <em>Service Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.ServiceExceptionTypeImpl
	 * @see net.opengis.ogc.impl.OGCExceptionsPackageImpl#getServiceExceptionType()
	 * @generated
	 */
	int SERVICE_EXCEPTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_TYPE__LOCATOR = 2;

	/**
	 * The number of structural features of the '<em>Service Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EXCEPTION_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.ogc.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ogc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ogc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getServiceExceptionReport <em>Service Exception Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Exception Report</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getServiceExceptionReport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceExceptionReport();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.ServiceExceptionReportType <em>Service Exception Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Exception Report Type</em>'.
	 * @see net.opengis.ogc.ServiceExceptionReportType
	 * @generated
	 */
	EClass getServiceExceptionReportType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.ServiceExceptionReportType#getServiceException <em>Service Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Exception</em>'.
	 * @see net.opengis.ogc.ServiceExceptionReportType#getServiceException()
	 * @see #getServiceExceptionReportType()
	 * @generated
	 */
	EReference getServiceExceptionReportType_ServiceException();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.ServiceExceptionReportType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.ogc.ServiceExceptionReportType#getVersion()
	 * @see #getServiceExceptionReportType()
	 * @generated
	 */
	EAttribute getServiceExceptionReportType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.ServiceExceptionType <em>Service Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Exception Type</em>'.
	 * @see net.opengis.ogc.ServiceExceptionType
	 * @generated
	 */
	EClass getServiceExceptionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.ServiceExceptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.ogc.ServiceExceptionType#getValue()
	 * @see #getServiceExceptionType()
	 * @generated
	 */
	EAttribute getServiceExceptionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.ServiceExceptionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see net.opengis.ogc.ServiceExceptionType#getCode()
	 * @see #getServiceExceptionType()
	 * @generated
	 */
	EAttribute getServiceExceptionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.ServiceExceptionType#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locator</em>'.
	 * @see net.opengis.ogc.ServiceExceptionType#getLocator()
	 * @see #getServiceExceptionType()
	 * @generated
	 */
	EAttribute getServiceExceptionType_Locator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OGCExceptionsFactory getOGCExceptionsFactory();

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
		 * The meta object literal for the '{@link net.opengis.ogc.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.DocumentRootImpl
		 * @see net.opengis.ogc.impl.OGCExceptionsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Service Exception Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_EXCEPTION_REPORT = eINSTANCE.getDocumentRoot_ServiceExceptionReport();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.ServiceExceptionReportTypeImpl <em>Service Exception Report Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.ServiceExceptionReportTypeImpl
		 * @see net.opengis.ogc.impl.OGCExceptionsPackageImpl#getServiceExceptionReportType()
		 * @generated
		 */
		EClass SERVICE_EXCEPTION_REPORT_TYPE = eINSTANCE.getServiceExceptionReportType();

		/**
		 * The meta object literal for the '<em><b>Service Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EXCEPTION_REPORT_TYPE__SERVICE_EXCEPTION = eINSTANCE.getServiceExceptionReportType_ServiceException();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXCEPTION_REPORT_TYPE__VERSION = eINSTANCE.getServiceExceptionReportType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.ServiceExceptionTypeImpl <em>Service Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.ServiceExceptionTypeImpl
		 * @see net.opengis.ogc.impl.OGCExceptionsPackageImpl#getServiceExceptionType()
		 * @generated
		 */
		EClass SERVICE_EXCEPTION_TYPE = eINSTANCE.getServiceExceptionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXCEPTION_TYPE__VALUE = eINSTANCE.getServiceExceptionType_Value();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXCEPTION_TYPE__CODE = eINSTANCE.getServiceExceptionType_Code();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EXCEPTION_TYPE__LOCATOR = eINSTANCE.getServiceExceptionType_Locator();

	}

} //OGCExceptionsPackage
