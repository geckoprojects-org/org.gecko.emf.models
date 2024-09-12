/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package oasis.names.tc.ciq.xsdschema.xAL;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * <!-- begin-model-doc -->
 * xAL: eXtensible Address Language 
 * This is an XML document type definition (DTD) for
 * defining addresses.
 * Original Date of Creation: 1 March 2001
 * Copyright(c) 2000, OASIS. All Rights Reserved [http://www.oasis-open.org]
 * Contact: Customer Information Quality Technical Committee, OASIS
 * http://www.oasis-open.org/committees/ciq
 * VERSION: 2.0 [MAJOR RELEASE] Date of Creation: 01 May 2002
 * Last Update: 24 July 2002
 * Previous Version: 1.3
 * Common Attributes:Type - If not documented then it means, possible values of Type not limited to: Official, Unique, Abbreviation, OldName, Synonym
 * Code:Address element codes are used by groups like postal groups like ECCMA, ADIS, UN/PROLIST for postal services
 * <!-- end-model-doc -->
 * @see oasis.names.tc.ciq.xsdschema.xAL.XALFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = XALPackage.eNS_URI, genModel = "/model/ogckml22.genmodel", genModelSourceLocations = {"model/ogckml22.genmodel","net.opengis.kml.model/model/ogckml22.genmodel"}, ecore="/model/xal-address.ecore", ecoreSourceLocations="/model/xal-address.ecore")
public interface XALPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xAL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XALPackage eINSTANCE = oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl.init();

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressDetailsImpl <em>Address Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressDetailsImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressDetails()
	 * @generated
	 */
	int ADDRESS_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Postal Service Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Address Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_LINES = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADMINISTRATIVE_AREA = 4;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__LOCALITY = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ANY = 7;

	/**
	 * The feature id for the '<em><b>Address Details Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_DETAILS_KEY = 8;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__CODE = 10;

	/**
	 * The feature id for the '<em><b>Current Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__CURRENT_STATUS = 11;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__USAGE = 12;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__VALID_FROM_DATE = 13;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__VALID_TO_DATE = 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ANY_ATTRIBUTE = 15;

	/**
	 * The number of structural features of the '<em>Address Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Address Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressIdentifierTypeImpl <em>Address Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressIdentifierTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressIdentifierType()
	 * @generated
	 */
	int ADDRESS_IDENTIFIER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__IDENTIFIER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Address Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Address Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLatitudeDirectionTypeImpl <em>Address Latitude Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLatitudeDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressLatitudeDirectionType()
	 * @generated
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Latitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Latitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLatitudeTypeImpl <em>Address Latitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLatitudeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressLatitudeType()
	 * @generated
	 */
	int ADDRESS_LATITUDE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Latitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Latitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLinesTypeImpl <em>Address Lines Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLinesTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressLinesType()
	 * @generated
	 */
	int ADDRESS_LINES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Address Lines Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Address Lines Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLineTypeImpl <em>Address Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLineTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressLineType()
	 * @generated
	 */
	int ADDRESS_LINE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLongitudeDirectionTypeImpl <em>Address Longitude Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLongitudeDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressLongitudeDirectionType()
	 * @generated
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Longitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Longitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLongitudeTypeImpl <em>Address Longitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressLongitudeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressLongitudeType()
	 * @generated
	 */
	int ADDRESS_LONGITUDE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Longitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Longitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AddressTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AdministrativeAreaNameTypeImpl <em>Administrative Area Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AdministrativeAreaNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAdministrativeAreaNameType()
	 * @generated
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.AdministrativeAreaTypeImpl <em>Administrative Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.AdministrativeAreaTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getAdministrativeAreaType()
	 * @generated
	 */
	int ADMINISTRATIVE_AREA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Administrative Area Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA = 2;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__LOCALITY = 3;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__POST_OFFICE = 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.BarcodeTypeImpl <em>Barcode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.BarcodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getBarcodeType()
	 * @generated
	 */
	int BARCODE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Barcode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Barcode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.BuildingNameTypeImpl <em>Building Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.BuildingNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getBuildingNameType()
	 * @generated
	 */
	int BUILDING_NAME_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Building Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Building Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.CountryNameCodeTypeImpl <em>Country Name Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.CountryNameCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getCountryNameCodeType()
	 * @generated
	 */
	int COUNTRY_NAME_CODE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__SCHEME = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Country Name Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country Name Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.CountryNameTypeImpl <em>Country Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.CountryNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getCountryNameType()
	 * @generated
	 */
	int COUNTRY_NAME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Country Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.CountryTypeImpl <em>Country Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.CountryTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Country Name Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__COUNTRY_NAME_CODE = 1;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__COUNTRY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ADMINISTRATIVE_AREA = 3;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__LOCALITY = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__THOROUGHFARE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Country Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Country Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DepartmentNameTypeImpl <em>Department Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.DepartmentNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDepartmentNameType()
	 * @generated
	 */
	int DEPARTMENT_NAME_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Department Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Department Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DepartmentTypeImpl <em>Department Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.DepartmentTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDepartmentType()
	 * @generated
	 */
	int DEPARTMENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Department Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__DEPARTMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__MAIL_STOP = 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__POSTAL_CODE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Department Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Department Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNameTypeImpl <em>Dependent Locality Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDependentLocalityNameType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Dependent Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependent Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNumberTypeImpl <em>Dependent Locality Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDependentLocalityNumberType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Number Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Dependent Locality Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependent Locality Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityTypeImpl <em>Dependent Locality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDependentLocalityType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Dependent Locality Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dependent Locality Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POST_BOX = 3;

	/**
	 * The feature id for the '<em><b>Large Mail User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER = 4;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POST_OFFICE = 5;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE = 6;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__THOROUGHFARE = 7;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__PREMISE = 8;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY = 9;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POSTAL_CODE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__INDICATOR = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__TYPE = 14;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__USAGE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE = 16;

	/**
	 * The number of structural features of the '<em>Dependent Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Dependent Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentThoroughfareTypeImpl <em>Dependent Thoroughfare Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.DependentThoroughfareTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDependentThoroughfareType()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Dependent Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Dependent Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.EndorsementLineCodeTypeImpl <em>Endorsement Line Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.EndorsementLineCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getEndorsementLineCodeType()
	 * @generated
	 */
	int ENDORSEMENT_LINE_CODE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Endorsement Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Endorsement Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.FirmNameTypeImpl <em>Firm Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.FirmNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getFirmNameType()
	 * @generated
	 */
	int FIRM_NAME_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Firm Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Firm Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.FirmTypeImpl <em>Firm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.FirmTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getFirmType()
	 * @generated
	 */
	int FIRM_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Firm Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__FIRM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__MAIL_STOP = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Firm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Firm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.KeyLineCodeTypeImpl <em>Key Line Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.KeyLineCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getKeyLineCodeType()
	 * @generated
	 */
	int KEY_LINE_CODE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Key Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Key Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.LargeMailUserIdentifierTypeImpl <em>Large Mail User Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.LargeMailUserIdentifierTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getLargeMailUserIdentifierType()
	 * @generated
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Large Mail User Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Large Mail User Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.LargeMailUserNameTypeImpl <em>Large Mail User Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.LargeMailUserNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getLargeMailUserNameType()
	 * @generated
	 */
	int LARGE_MAIL_USER_NAME_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Large Mail User Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Large Mail User Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.LargeMailUserTypeImpl <em>Large Mail User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.LargeMailUserTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getLargeMailUserType()
	 * @generated
	 */
	int LARGE_MAIL_USER_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Large Mail User Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Large Mail User Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__BUILDING_NAME = 3;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__POST_BOX = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__POSTAL_CODE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ANY = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Large Mail User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Large Mail User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.LocalityNameTypeImpl <em>Locality Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.LocalityNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getLocalityNameType()
	 * @generated
	 */
	int LOCALITY_NAME_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.LocalityTypeImpl <em>Locality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.LocalityTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getLocalityType()
	 * @generated
	 */
	int LOCALITY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Locality Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__LOCALITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POST_BOX = 2;

	/**
	 * The feature id for the '<em><b>Large Mail User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__LARGE_MAIL_USER = 3;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POST_OFFICE = 4;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POSTAL_ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__PREMISE = 7;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__DEPENDENT_LOCALITY = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ANY = 10;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__INDICATOR = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__USAGE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ANY_ATTRIBUTE = 14;

	/**
	 * The number of structural features of the '<em>Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.MailStopNameTypeImpl <em>Mail Stop Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.MailStopNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getMailStopNameType()
	 * @generated
	 */
	int MAIL_STOP_NAME_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mail Stop Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mail Stop Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.MailStopNumberTypeImpl <em>Mail Stop Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.MailStopNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getMailStopNumberType()
	 * @generated
	 */
	int MAIL_STOP_NUMBER_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Number Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__NAME_NUMBER_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mail Stop Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mail Stop Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.MailStopTypeImpl <em>Mail Stop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.MailStopTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getMailStopType()
	 * @generated
	 */
	int MAIL_STOP_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Mail Stop Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__MAIL_STOP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mail Stop Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__MAIL_STOP_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Mail Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Mail Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostalCodeNumberExtensionTypeImpl <em>Postal Code Number Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostalCodeNumberExtensionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostalCodeNumberExtensionType()
	 * @generated
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Extension Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Postal Code Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Postal Code Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostalCodeNumberTypeImpl <em>Postal Code Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostalCodeNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostalCodeNumberType()
	 * @generated
	 */
	int POSTAL_CODE_NUMBER_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Postal Code Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Postal Code Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostalCodeTypeImpl <em>Postal Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostalCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostalCodeType()
	 * @generated
	 */
	int POSTAL_CODE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Postal Code Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POSTAL_CODE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Postal Code Number Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POSTAL_CODE_NUMBER_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Post Town</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POST_TOWN = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Postal Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Postal Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostalRouteNameTypeImpl <em>Postal Route Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostalRouteNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostalRouteNameType()
	 * @generated
	 */
	int POSTAL_ROUTE_NAME_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Postal Route Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Postal Route Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostalRouteNumberTypeImpl <em>Postal Route Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostalRouteNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostalRouteNumberType()
	 * @generated
	 */
	int POSTAL_ROUTE_NUMBER_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Postal Route Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Postal Route Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostalRouteTypeImpl <em>Postal Route Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostalRouteTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostalRouteType()
	 * @generated
	 */
	int POSTAL_ROUTE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Postal Route Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Postal Route Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POST_BOX = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Postal Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Postal Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostalServiceElementsTypeImpl <em>Postal Service Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostalServiceElementsTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostalServiceElementsType()
	 * @generated
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Address Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Endorsement Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Key Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Barcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE = 3;

	/**
	 * The feature id for the '<em><b>Sorting Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE = 4;

	/**
	 * The feature id for the '<em><b>Address Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE = 5;

	/**
	 * The feature id for the '<em><b>Address Latitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION = 6;

	/**
	 * The feature id for the '<em><b>Address Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE = 7;

	/**
	 * The feature id for the '<em><b>Address Longitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION = 8;

	/**
	 * The feature id for the '<em><b>Supplementary Postal Service Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ANY = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__TYPE = 11;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE = 12;

	/**
	 * The number of structural features of the '<em>Postal Service Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Postal Service Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberExtensionTypeImpl <em>Post Box Number Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberExtensionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostBoxNumberExtensionType()
	 * @generated
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Number Extension Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Box Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post Box Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberPrefixTypeImpl <em>Post Box Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostBoxNumberPrefixType()
	 * @generated
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Box Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Box Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberSuffixTypeImpl <em>Post Box Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostBoxNumberSuffixType()
	 * @generated
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Box Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Box Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberTypeImpl <em>Post Box Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostBoxNumberType()
	 * @generated
	 */
	int POST_BOX_NUMBER_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Box Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post Box Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxTypeImpl <em>Post Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostBoxTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostBoxType()
	 * @generated
	 */
	int POST_BOX_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Box Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Post Box Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Post Box Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX = 3;

	/**
	 * The feature id for the '<em><b>Post Box Number Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__FIRM = 5;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POSTAL_CODE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__INDICATOR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Post Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Post Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostOfficeNameTypeImpl <em>Post Office Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostOfficeNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostOfficeNameType()
	 * @generated
	 */
	int POST_OFFICE_NAME_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Office Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Office Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostOfficeNumberTypeImpl <em>Post Office Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostOfficeNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostOfficeNumberType()
	 * @generated
	 */
	int POST_OFFICE_NUMBER_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Post Office Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Post Office Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostOfficeTypeImpl <em>Post Office Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostOfficeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostOfficeType()
	 * @generated
	 */
	int POST_OFFICE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Office Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_OFFICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Office Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_OFFICE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POSTAL_ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_BOX = 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POSTAL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Post Office Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Post Office Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostTownNameTypeImpl <em>Post Town Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostTownNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostTownNameType()
	 * @generated
	 */
	int POST_TOWN_NAME_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Town Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Post Town Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostTownSuffixTypeImpl <em>Post Town Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostTownSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostTownSuffixType()
	 * @generated
	 */
	int POST_TOWN_SUFFIX_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Town Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post Town Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PostTownTypeImpl <em>Post Town Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PostTownTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPostTownType()
	 * @generated
	 */
	int POST_TOWN_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Town Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__POST_TOWN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Town Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__POST_TOWN_SUFFIX = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Post Town Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Post Town Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseLocationTypeImpl <em>Premise Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseLocationTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseLocationType()
	 * @generated
	 */
	int PREMISE_LOCATION_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNameTypeImpl <em>Premise Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseNameType()
	 * @generated
	 */
	int PREMISE_NAME_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberPrefixTypeImpl <em>Premise Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseNumberPrefixType()
	 * @generated
	 */
	int PREMISE_NUMBER_PREFIX_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberRangeFromTypeImpl <em>Premise Number Range From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberRangeFromTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseNumberRangeFromType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX = 3;

	/**
	 * The number of structural features of the '<em>Premise Number Range From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Premise Number Range From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberRangeToTypeImpl <em>Premise Number Range To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberRangeToTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseNumberRangeToType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER_SUFFIX = 3;

	/**
	 * The number of structural features of the '<em>Premise Number Range To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Premise Number Range To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberRangeTypeImpl <em>Premise Number Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberRangeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseNumberRangeType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Premise Number Range From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Range To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Range Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE = 4;

	/**
	 * The feature id for the '<em><b>Range Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__SEPARATOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Premise Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Premise Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberSuffixTypeImpl <em>Premise Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseNumberSuffixType()
	 * @generated
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberTypeImpl <em>Premise Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseNumberType()
	 * @generated
	 */
	int PREMISE_NUMBER_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__NUMBER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseTypeImpl <em>Premise Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.PremiseTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getPremiseType()
	 * @generated
	 */
	int PREMISE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Premise Number Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_PREFIX = 5;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_SUFFIX = 6;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__BUILDING_NAME = 7;

	/**
	 * The feature id for the '<em><b>Sub Premise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__SUB_PREMISE = 8;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__FIRM = 9;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__MAIL_STOP = 10;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__POSTAL_CODE = 11;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ANY = 13;

	/**
	 * The feature id for the '<em><b>Premise Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_DEPENDENCY = 14;

	/**
	 * The feature id for the '<em><b>Premise Dependency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Premise Thoroughfare Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ANY_ATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SortingCodeTypeImpl <em>Sorting Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SortingCodeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSortingCodeType()
	 * @generated
	 */
	int SORTING_CODE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Sorting Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sorting Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubAdministrativeAreaNameTypeImpl <em>Sub Administrative Area Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubAdministrativeAreaNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubAdministrativeAreaNameType()
	 * @generated
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Sub Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sub Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubAdministrativeAreaTypeImpl <em>Sub Administrative Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubAdministrativeAreaTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubAdministrativeAreaType()
	 * @generated
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Sub Administrative Area Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__LOCALITY = 2;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__POST_OFFICE = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__INDICATOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Sub Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Sub Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseLocationTypeImpl <em>Sub Premise Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseLocationTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubPremiseLocationType()
	 * @generated
	 */
	int SUB_PREMISE_LOCATION_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Sub Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sub Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNameTypeImpl <em>Sub Premise Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubPremiseNameType()
	 * @generated
	 */
	int SUB_PREMISE_NAME_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNumberPrefixTypeImpl <em>Sub Premise Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubPremiseNumberPrefixType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNumberSuffixTypeImpl <em>Sub Premise Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubPremiseNumberSuffixType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNumberTypeImpl <em>Sub Premise Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubPremiseNumberType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE = 4;

	/**
	 * The feature id for the '<em><b>Premise Number Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__PREMISE_NUMBER_SEPARATOR = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Sub Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseTypeImpl <em>Sub Premise Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SubPremiseTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSubPremiseType()
	 * @generated
	 */
	int SUB_PREMISE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Sub Premise Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Sub Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Sub Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Sub Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__BUILDING_NAME = 6;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__FIRM = 7;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__MAIL_STOP = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Sub Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Sub Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Sub Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.SupplementaryPostalServiceDataTypeImpl <em>Supplementary Postal Service Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.SupplementaryPostalServiceDataTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Supplementary Postal Service Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Supplementary Postal Service Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareLeadingTypeTypeImpl <em>Thoroughfare Leading Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareLeadingTypeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareLeadingTypeType()
	 * @generated
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Leading Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Leading Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNameTypeImpl <em>Thoroughfare Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNameTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareNameType()
	 * @generated
	 */
	int THOROUGHFARE_NAME_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberFromTypeImpl <em>Thoroughfare Number From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberFromTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareNumberFromType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__ADDRESS_LINE = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Thoroughfare Number From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberPrefixTypeImpl <em>Thoroughfare Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberPrefixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareNumberPrefixType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberRangeTypeImpl <em>Thoroughfare Number Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberRangeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareNumberRangeType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR = 4;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE = 5;

	/**
	 * The feature id for the '<em><b>Number Range Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE = 6;

	/**
	 * The feature id for the '<em><b>Range Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberSuffixTypeImpl <em>Thoroughfare Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberSuffixTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareNumberSuffixType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberToTypeImpl <em>Thoroughfare Number To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberToTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareNumberToType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Thoroughfare Number To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberTypeImpl <em>Thoroughfare Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareNumberTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareNumberType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__NUMBER_OCCURRENCE = 4;

	/**
	 * The feature id for the '<em><b>Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__NUMBER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Thoroughfare Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfarePostDirectionTypeImpl <em>Thoroughfare Post Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfarePostDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfarePostDirectionType()
	 * @generated
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Post Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Post Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfarePreDirectionTypeImpl <em>Thoroughfare Pre Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfarePreDirectionTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfarePreDirectionType()
	 * @generated
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Pre Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Pre Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareTrailingTypeTypeImpl <em>Thoroughfare Trailing Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareTrailingTypeTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareTrailingTypeType()
	 * @generated
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Trailing Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Thoroughfare Trailing Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareTypeImpl <em>Thoroughfare Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.ThoroughfareTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getThoroughfareType()
	 * @generated
	 */
	int THOROUGHFARE_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION = 6;

	/**
	 * The feature id for the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NAME = 8;

	/**
	 * The feature id for the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION = 10;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE = 11;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_LOCALITY = 12;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__PREMISE = 13;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__FIRM = 14;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__POSTAL_CODE = 15;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ANY = 16;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES = 17;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR = 18;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR = 19;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__TYPE = 21;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ANY_ATTRIBUTE = 22;

	/**
	 * The number of structural features of the '<em>Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 83;

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
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_DETAILS = 3;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_LINE = 4;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADMINISTRATIVE_AREA = 5;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY_NAME = 6;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPARTMENT = 7;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALITY = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_BOX = 10;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_OFFICE = 11;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE = 12;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX = 14;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX = 15;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE = 16;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX = 18;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX = 19;

	/**
	 * The feature id for the '<em><b>XAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XAL = 20;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.impl.XALTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALTypeImpl
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getXALType()
	 * @generated
	 */
	int XAL_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ADDRESS_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDependentThoroughfaresType()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARES_TYPE = 85;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType <em>Indicator Occurence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurenceType()
	 * @generated
	 */
	int INDICATOR_OCCURENCE_TYPE = 86;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType <em>Indicator Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE = 87;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1 <em>Indicator Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType1()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE1 = 88;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2 <em>Indicator Occurrence Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType2()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE2 = 89;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3 <em>Indicator Occurrence Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType3()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE3 = 90;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4 <em>Indicator Occurrence Type4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType4()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE4 = 91;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType <em>Name Number Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNameNumberOccurrenceType()
	 * @generated
	 */
	int NAME_NUMBER_OCCURRENCE_TYPE = 92;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType <em>Number Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberOccurrenceType()
	 * @generated
	 */
	int NUMBER_OCCURRENCE_TYPE = 93;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType <em>Number Range Occurence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberRangeOccurenceType()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURENCE_TYPE = 94;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType <em>Number Range Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberRangeOccurrenceType()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURRENCE_TYPE = 95;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType <em>Number Type Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceType()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE = 96;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceType1()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE1 = 97;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType <em>Number Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeType()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE = 98;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1 <em>Number Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeType1()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE1 = 99;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType <em>Range Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getRangeTypeType()
	 * @generated
	 */
	int RANGE_TYPE_TYPE = 100;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType <em>Type Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getTypeOccurrenceType()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE = 101;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1 <em>Type Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getTypeOccurrenceType1()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE1 = 102;

	/**
	 * The meta object id for the '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2 <em>Type Occurrence Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getTypeOccurrenceType2()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE2 = 103;

	/**
	 * The meta object id for the '<em>Dependent Thoroughfares Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getDependentThoroughfaresTypeObject()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARES_TYPE_OBJECT = 104;

	/**
	 * The meta object id for the '<em>Indicator Occurence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurenceTypeObject()
	 * @generated
	 */
	int INDICATOR_OCCURENCE_TYPE_OBJECT = 105;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject1()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT1 = 107;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject2()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT2 = 108;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject3()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT3 = 109;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject4()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT4 = 110;

	/**
	 * The meta object id for the '<em>Name Number Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNameNumberOccurrenceTypeObject()
	 * @generated
	 */
	int NAME_NUMBER_OCCURRENCE_TYPE_OBJECT = 111;

	/**
	 * The meta object id for the '<em>Number Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_OCCURRENCE_TYPE_OBJECT = 112;

	/**
	 * The meta object id for the '<em>Number Range Occurence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberRangeOccurenceTypeObject()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURENCE_TYPE_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Number Range Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberRangeOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURRENCE_TYPE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Number Type Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT = 115;

	/**
	 * The meta object id for the '<em>Number Type Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceTypeObject1()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT1 = 116;

	/**
	 * The meta object id for the '<em>Number Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeTypeObject()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE_OBJECT = 117;

	/**
	 * The meta object id for the '<em>Number Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getNumberTypeTypeObject1()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE_OBJECT1 = 118;

	/**
	 * The meta object id for the '<em>Range Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getRangeTypeTypeObject()
	 * @generated
	 */
	int RANGE_TYPE_TYPE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getTypeOccurrenceTypeObject()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getTypeOccurrenceTypeObject1()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT1 = 121;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2
	 * @see oasis.names.tc.ciq.xsdschema.xAL.impl.XALPackageImpl#getTypeOccurrenceTypeObject2()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT2 = 122;


	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails
	 * @generated
	 */
	EClass getAddressDetails();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getPostalServiceElements <em>Postal Service Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Service Elements</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getPostalServiceElements()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_PostalServiceElements();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddress()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Address();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddressLines <em>Address Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Lines</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddressLines()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_AddressLines();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getCountry()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Country();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAdministrativeArea()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getLocality()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getThoroughfare()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Thoroughfare();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAny()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddressDetailsKey <em>Address Details Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Details Key</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddressDetailsKey()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AddressDetailsKey();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAddressType()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AddressType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getCode()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getCurrentStatus <em>Current Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Status</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getCurrentStatus()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_CurrentStatus();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getUsage()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Usage();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getValidFromDate()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_ValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getValidToDate <em>Valid To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To Date</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getValidToDate()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_ValidToDate();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressDetails#getAnyAttribute()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType <em>Address Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Identifier Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType
	 * @generated
	 */
	EClass getAddressIdentifierType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getMixed()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getCode()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getIdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getIdentifierType()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_IdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getType()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressIdentifierType#getAnyAttribute()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType <em>Address Latitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Latitude Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType
	 * @generated
	 */
	EClass getAddressLatitudeDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getMixed()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getCode()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getType()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeDirectionType#getAnyAttribute()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType <em>Address Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Latitude Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType
	 * @generated
	 */
	EClass getAddressLatitudeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getMixed()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getCode()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getType()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLatitudeType#getAnyAttribute()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType <em>Address Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Lines Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType
	 * @generated
	 */
	EClass getAddressLinesType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType#getAddressLine()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EReference getAddressLinesType_AddressLine();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType#getAny()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EAttribute getAddressLinesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLinesType#getAnyAttribute()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EAttribute getAddressLinesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLineType <em>Address Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Line Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLineType
	 * @generated
	 */
	EClass getAddressLineType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getMixed()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getCode()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getType()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLineType#getAnyAttribute()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType <em>Address Longitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Longitude Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType
	 * @generated
	 */
	EClass getAddressLongitudeDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getMixed()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getCode()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getType()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeDirectionType#getAnyAttribute()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType <em>Address Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Longitude Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType
	 * @generated
	 */
	EClass getAddressLongitudeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getMixed()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getCode()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getType()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressLongitudeType#getAnyAttribute()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressType#getMixed()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressType#getCode()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressType#getType()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AddressType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AddressType#getAnyAttribute()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType <em>Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Area Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType
	 * @generated
	 */
	EClass getAdministrativeAreaNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getMixed()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getCode()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getType()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaNameType#getAnyAttribute()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType <em>Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Area Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType
	 * @generated
	 */
	EClass getAdministrativeAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAddressLine()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAdministrativeAreaName <em>Administrative Area Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Administrative Area Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAdministrativeAreaName()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_AdministrativeAreaName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getSubAdministrativeArea <em>Sub Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getSubAdministrativeArea()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_SubAdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getLocality()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getPostOffice()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getPostalCode()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAny()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getIndicator()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getType()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getUsageType()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType#getAnyAttribute()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.BarcodeType <em>Barcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barcode Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BarcodeType
	 * @generated
	 */
	EClass getBarcodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getMixed()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getCode()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getType()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BarcodeType#getAnyAttribute()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType <em>Building Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType
	 * @generated
	 */
	EClass getBuildingNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getMixed()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getCode()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getType()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getTypeOccurrence()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.BuildingNameType#getAnyAttribute()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType <em>Country Name Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Name Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType
	 * @generated
	 */
	EClass getCountryNameCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getMixed()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getCode()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getScheme()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Scheme();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameCodeType#getAnyAttribute()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameType <em>Country Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameType
	 * @generated
	 */
	EClass getCountryNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getMixed()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getCode()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getType()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryNameType#getAnyAttribute()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType
	 * @generated
	 */
	EClass getCountryType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAddressLine()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getCountryNameCode <em>Country Name Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country Name Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getCountryNameCode()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_CountryNameCode();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getCountryName()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_CountryName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAdministrativeArea()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getLocality()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getThoroughfare()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_Thoroughfare();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAny()
	 * @see #getCountryType()
	 * @generated
	 */
	EAttribute getCountryType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.CountryType#getAnyAttribute()
	 * @see #getCountryType()
	 * @generated
	 */
	EAttribute getCountryType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType <em>Department Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType
	 * @generated
	 */
	EClass getDepartmentNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getMixed()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getCode()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getType()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentNameType#getAnyAttribute()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType <em>Department Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType
	 * @generated
	 */
	EClass getDepartmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getAddressLine()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getDepartmentName <em>Department Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getDepartmentName()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_DepartmentName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getMailStop()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getPostalCode()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getAny()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getType()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DepartmentType#getAnyAttribute()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType <em>Dependent Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType
	 * @generated
	 */
	EClass getDependentLocalityNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getMixed()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getCode()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getType()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNameType#getAnyAttribute()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType <em>Dependent Locality Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType
	 * @generated
	 */
	EClass getDependentLocalityNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getMixed()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getCode()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getNameNumberOccurrence <em>Name Number Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Number Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getNameNumberOccurrence()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_NameNumberOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType#getAnyAttribute()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType <em>Dependent Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType
	 * @generated
	 */
	EClass getDependentLocalityType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getAddressLine()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getDependentLocalityName <em>Dependent Locality Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Locality Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getDependentLocalityName()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocalityName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getDependentLocalityNumber <em>Dependent Locality Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getDependentLocalityNumber()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocalityNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostBox()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getLargeMailUser <em>Large Mail User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getLargeMailUser()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_LargeMailUser();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostOffice()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostalRoute()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getThoroughfare()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPremise()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getDependentLocality()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getPostalCode()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getAny()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getConnector()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Connector();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getIndicator()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getType()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getUsageType()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityType#getAnyAttribute()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType <em>Dependent Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Thoroughfare Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType
	 * @generated
	 */
	EClass getDependentThoroughfareType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getAddressLine()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Pre Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfarePreDirection()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfarePreDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Leading Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfareLeadingType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareLeadingType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfareName()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Trailing Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfareTrailingType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareTrailingType();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Post Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getThoroughfarePostDirection()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfarePostDirection();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getAny()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfareType#getAnyAttribute()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType <em>Endorsement Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endorsement Line Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType
	 * @generated
	 */
	EClass getEndorsementLineCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getMixed()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getCode()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getType()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.EndorsementLineCodeType#getAnyAttribute()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmNameType <em>Firm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firm Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmNameType
	 * @generated
	 */
	EClass getFirmNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getMixed()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getCode()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getType()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmNameType#getAnyAttribute()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType <em>Firm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firm Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType
	 * @generated
	 */
	EClass getFirmType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getAddressLine()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getFirmName <em>Firm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firm Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getFirmName()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_FirmName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getDepartment()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_Department();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getMailStop()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getPostalCode()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getAny()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getType()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.FirmType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.FirmType#getAnyAttribute()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType <em>Key Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Line Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType
	 * @generated
	 */
	EClass getKeyLineCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getMixed()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getCode()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getType()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.KeyLineCodeType#getAnyAttribute()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType <em>Large Mail User Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Identifier Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType
	 * @generated
	 */
	EClass getLargeMailUserIdentifierType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getMixed()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getCode()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getIndicator()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getType()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserIdentifierType#getAnyAttribute()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType <em>Large Mail User Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType
	 * @generated
	 */
	EClass getLargeMailUserNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getMixed()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getCode()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getType()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserNameType#getAnyAttribute()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType <em>Large Mail User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType
	 * @generated
	 */
	EClass getLargeMailUserType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getAddressLine()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getLargeMailUserName <em>Large Mail User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Large Mail User Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getLargeMailUserName()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_LargeMailUserName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getLargeMailUserIdentifier <em>Large Mail User Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User Identifier</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getLargeMailUserIdentifier()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_LargeMailUserIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getBuildingName()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_BuildingName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Department</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getDepartment()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_Department();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getPostBox()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getThoroughfare()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getPostalCode()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getAny()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getType()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LargeMailUserType#getAnyAttribute()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType <em>Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locality Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType
	 * @generated
	 */
	EClass getLocalityNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getMixed()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getCode()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getType()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityNameType#getAnyAttribute()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType <em>Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locality Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType
	 * @generated
	 */
	EClass getLocalityType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getAddressLine()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getLocalityName <em>Locality Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locality Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getLocalityName()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_LocalityName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostBox()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getLargeMailUser <em>Large Mail User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getLargeMailUser()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_LargeMailUser();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostOffice()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostalRoute()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getThoroughfare()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPremise()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getDependentLocality()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getPostalCode()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getAny()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getIndicator()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getType()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getUsageType()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.LocalityType#getAnyAttribute()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType <em>Mail Stop Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType
	 * @generated
	 */
	EClass getMailStopNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getMixed()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getCode()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getType()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNameType#getAnyAttribute()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType <em>Mail Stop Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType
	 * @generated
	 */
	EClass getMailStopNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getMixed()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getCode()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getNameNumberSeparator <em>Name Number Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Number Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getNameNumberSeparator()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_NameNumberSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopNumberType#getAnyAttribute()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType <em>Mail Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType
	 * @generated
	 */
	EClass getMailStopType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getAddressLine()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getMailStopName <em>Mail Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getMailStopName()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_MailStopName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getMailStopNumber <em>Mail Stop Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getMailStopNumber()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_MailStopNumber();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getAny()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getType()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.MailStopType#getAnyAttribute()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType <em>Postal Code Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Number Extension Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType
	 * @generated
	 */
	EClass getPostalCodeNumberExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getMixed()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getCode()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getNumberExtensionSeparator <em>Number Extension Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Extension Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getNumberExtensionSeparator()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_NumberExtensionSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getType()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberExtensionType#getAnyAttribute()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType <em>Postal Code Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType
	 * @generated
	 */
	EClass getPostalCodeNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getMixed()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getCode()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getType()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeNumberType#getAnyAttribute()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType <em>Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType
	 * @generated
	 */
	EClass getPostalCodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getAddressLine()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getPostalCodeNumber <em>Postal Code Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Code Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getPostalCodeNumber()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostalCodeNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getPostalCodeNumberExtension <em>Postal Code Number Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Code Number Extension</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getPostalCodeNumberExtension()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostalCodeNumberExtension();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getPostTown <em>Post Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Town</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getPostTown()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostTown();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getAny()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getType()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType#getAnyAttribute()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType <em>Postal Route Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType
	 * @generated
	 */
	EClass getPostalRouteNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getMixed()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getCode()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getType()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNameType#getAnyAttribute()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType <em>Postal Route Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType
	 * @generated
	 */
	EClass getPostalRouteNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType#getMixed()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType#getCode()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteNumberType#getAnyAttribute()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType <em>Postal Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType
	 * @generated
	 */
	EClass getPostalRouteType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getAddressLine()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getPostalRouteName <em>Postal Route Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Route Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getPostalRouteName()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostalRouteName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getPostalRouteNumber <em>Postal Route Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getPostalRouteNumber()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostalRouteNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getPostBox()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostBox();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getAny()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getType()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalRouteType#getAnyAttribute()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType <em>Postal Service Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Service Elements Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType
	 * @generated
	 */
	EClass getPostalServiceElementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressIdentifier <em>Address Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Identifier</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressIdentifier()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getEndorsementLineCode <em>Endorsement Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endorsement Line Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getEndorsementLineCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_EndorsementLineCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getKeyLineCode <em>Key Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Line Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getKeyLineCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_KeyLineCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getBarcode <em>Barcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Barcode</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getBarcode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_Barcode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getSortingCode <em>Sorting Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getSortingCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_SortingCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLatitude <em>Address Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Latitude</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLatitude()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLatitude();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLatitudeDirection <em>Address Latitude Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Latitude Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLatitudeDirection()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLatitudeDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLongitude <em>Address Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Longitude</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLongitude()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLongitude();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLongitudeDirection <em>Address Longitude Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Longitude Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAddressLongitudeDirection()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLongitudeDirection();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getSupplementaryPostalServiceData <em>Supplementary Postal Service Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplementary Postal Service Data</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getSupplementaryPostalServiceData()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_SupplementaryPostalServiceData();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAny()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getType()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostalServiceElementsType#getAnyAttribute()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType <em>Post Box Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Extension Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType
	 * @generated
	 */
	EClass getPostBoxNumberExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType#getMixed()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType#getNumberExtensionSeparator <em>Number Extension Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Extension Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType#getNumberExtensionSeparator()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_NumberExtensionSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberExtensionType#getAnyAttribute()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType <em>Post Box Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType
	 * @generated
	 */
	EClass getPostBoxNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getMixed()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getCode()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberPrefixType#getAnyAttribute()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType <em>Post Box Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType
	 * @generated
	 */
	EClass getPostBoxNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getMixed()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getCode()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberSuffixType#getAnyAttribute()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType <em>Post Box Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType
	 * @generated
	 */
	EClass getPostBoxNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType#getMixed()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType#getCode()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxNumberType#getAnyAttribute()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType <em>Post Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType
	 * @generated
	 */
	EClass getPostBoxType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getAddressLine()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumber <em>Post Box Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumber()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumberPrefix <em>Post Box Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumberPrefix()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumberSuffix <em>Post Box Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumberSuffix()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumberExtension <em>Post Box Number Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Extension</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostBoxNumberExtension()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberExtension();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getFirm()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getPostalCode()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getAny()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getIndicator()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getType()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostBoxType#getAnyAttribute()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType <em>Post Office Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType
	 * @generated
	 */
	EClass getPostOfficeNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getMixed()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getCode()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getType()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNameType#getAnyAttribute()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType <em>Post Office Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType
	 * @generated
	 */
	EClass getPostOfficeNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getMixed()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getCode()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getIndicator()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getIndicatorOccurrence()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeNumberType#getAnyAttribute()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType <em>Post Office Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType
	 * @generated
	 */
	EClass getPostOfficeType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getAddressLine()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostOfficeName <em>Post Office Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Office Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostOfficeName()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostOfficeName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostOfficeNumber <em>Post Office Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostOfficeNumber()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostOfficeNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostalRoute()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostBox()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getPostalCode()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getAny()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getIndicator()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getType()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType#getAnyAttribute()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType <em>Post Town Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType
	 * @generated
	 */
	EClass getPostTownNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getMixed()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getCode()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getType()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownNameType#getAnyAttribute()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType <em>Post Town Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType
	 * @generated
	 */
	EClass getPostTownSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType#getMixed()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType#getCode()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownSuffixType#getAnyAttribute()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownType <em>Post Town Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownType
	 * @generated
	 */
	EClass getPostTownType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getAddressLine()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getPostTownName <em>Post Town Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Town Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getPostTownName()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_PostTownName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getPostTownSuffix <em>Post Town Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Town Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getPostTownSuffix()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_PostTownSuffix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getType()
	 * @see #getPostTownType()
	 * @generated
	 */
	EAttribute getPostTownType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PostTownType#getAnyAttribute()
	 * @see #getPostTownType()
	 * @generated
	 */
	EAttribute getPostTownType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType <em>Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Location Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType
	 * @generated
	 */
	EClass getPremiseLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType#getMixed()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType#getCode()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseLocationType#getAnyAttribute()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType <em>Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType
	 * @generated
	 */
	EClass getPremiseNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getMixed()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getCode()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getType()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getTypeOccurrence()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getAnyAttribute()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType <em>Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType
	 * @generated
	 */
	EClass getPremiseNumberPrefixType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getValue()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Value();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getCode()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getType()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType#getAnyAttribute()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType <em>Premise Number Range From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range From Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType
	 * @generated
	 */
	EClass getPremiseNumberRangeFromType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getAddressLine()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getPremiseNumberPrefix()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getPremiseNumber()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeFromType#getPremiseNumberSuffix()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType <em>Premise Number Range To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range To Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType
	 * @generated
	 */
	EClass getPremiseNumberRangeToType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getAddressLine()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getPremiseNumberPrefix()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getPremiseNumber()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeToType#getPremiseNumberSuffix()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType <em>Premise Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType
	 * @generated
	 */
	EClass getPremiseNumberRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getPremiseNumberRangeFrom <em>Premise Number Range From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getPremiseNumberRangeFrom()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EReference getPremiseNumberRangeType_PremiseNumberRangeFrom();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getPremiseNumberRangeTo <em>Premise Number Range To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getPremiseNumberRangeTo()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EReference getPremiseNumberRangeType_PremiseNumberRangeTo();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getIndicator()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getIndicatorOccurence <em>Indicator Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getIndicatorOccurence()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_IndicatorOccurence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getNumberRangeOccurence <em>Number Range Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Range Occurence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getNumberRangeOccurence()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_NumberRangeOccurence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getRangeType()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_RangeType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getSeparator()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberRangeType#getType()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Type();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType <em>Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType
	 * @generated
	 */
	EClass getPremiseNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getMixed()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getCode()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getType()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType#getAnyAttribute()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType <em>Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType
	 * @generated
	 */
	EClass getPremiseNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getMixed()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getCode()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicator()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicatorOccurrence()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberType()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_NumberType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberTypeOccurrence()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_NumberTypeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getType()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getAnyAttribute()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType <em>Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType
	 * @generated
	 */
	EClass getPremiseType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getAddressLine()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseName <em>Premise Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseName()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseLocation <em>Premise Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Location</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseLocation()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumber()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumberRange <em>Premise Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumberRange()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberRange();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumberPrefix()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseNumberSuffix()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getBuildingName()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_BuildingName();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getSubPremise <em>Sub Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getSubPremise()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_SubPremise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getFirm()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getMailStop()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPostalCode()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremise()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_Premise();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getAny()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseDependency <em>Premise Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Dependency</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseDependency()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseDependency();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseDependencyType <em>Premise Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Dependency Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseDependencyType()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseDependencyType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseThoroughfareConnector <em>Premise Thoroughfare Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Thoroughfare Connector</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getPremiseThoroughfareConnector()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseThoroughfareConnector();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getType()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.PremiseType#getAnyAttribute()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType <em>Sorting Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Code Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType
	 * @generated
	 */
	EClass getSortingCodeType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType#getCode()
	 * @see #getSortingCodeType()
	 * @generated
	 */
	EAttribute getSortingCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SortingCodeType#getType()
	 * @see #getSortingCodeType()
	 * @generated
	 */
	EAttribute getSortingCodeType_Type();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType <em>Sub Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Administrative Area Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType
	 * @generated
	 */
	EClass getSubAdministrativeAreaNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getMixed()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getCode()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getType()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaNameType#getAnyAttribute()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType <em>Sub Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Administrative Area Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType
	 * @generated
	 */
	EClass getSubAdministrativeAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getAddressLine()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getSubAdministrativeAreaName <em>Sub Administrative Area Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Administrative Area Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getSubAdministrativeAreaName()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_SubAdministrativeAreaName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getLocality()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getPostOffice()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getPostalCode()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getAny()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getIndicator()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getType()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getUsageType()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubAdministrativeAreaType#getAnyAttribute()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType <em>Sub Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Location Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType
	 * @generated
	 */
	EClass getSubPremiseLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType#getMixed()
	 * @see #getSubPremiseLocationType()
	 * @generated
	 */
	EAttribute getSubPremiseLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseLocationType#getCode()
	 * @see #getSubPremiseLocationType()
	 * @generated
	 */
	EAttribute getSubPremiseLocationType_Code();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType <em>Sub Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType
	 * @generated
	 */
	EClass getSubPremiseNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getMixed()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getCode()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getType()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getTypeOccurrence()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNameType#getAnyAttribute()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType <em>Sub Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType
	 * @generated
	 */
	EClass getSubPremiseNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getMixed()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getCode()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getType()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberPrefixType#getAnyAttribute()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType <em>Sub Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType
	 * @generated
	 */
	EClass getSubPremiseNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getMixed()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getCode()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getType()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberSuffixType#getAnyAttribute()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType <em>Sub Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType
	 * @generated
	 */
	EClass getSubPremiseNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getMixed()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getCode()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getIndicator()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getIndicatorOccurrence()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getNumberTypeOccurrence()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_NumberTypeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getPremiseNumberSeparator <em>Premise Number Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Number Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getPremiseNumberSeparator()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_PremiseNumberSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getType()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseNumberType#getAnyAttribute()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType <em>Sub Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType
	 * @generated
	 */
	EClass getSubPremiseType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getAddressLine()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseName <em>Sub Premise Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseName()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseLocation <em>Sub Premise Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Premise Location</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseLocation()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseNumber <em>Sub Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseNumber()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseNumberPrefix <em>Sub Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseNumberPrefix()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseNumberSuffix <em>Sub Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremiseNumberSuffix()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getBuildingName()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_BuildingName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getFirm()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getMailStop()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getPostalCode()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremise <em>Sub Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getSubPremise()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremise();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getAny()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getType()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SubPremiseType#getAnyAttribute()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType <em>Supplementary Postal Service Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplementary Postal Service Data Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType
	 * @generated
	 */
	EClass getSupplementaryPostalServiceDataType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getMixed()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getCode()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getType()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.SupplementaryPostalServiceDataType#getAnyAttribute()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType <em>Thoroughfare Leading Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Leading Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType
	 * @generated
	 */
	EClass getThoroughfareLeadingTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getMixed()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getCode()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getType()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareLeadingTypeType#getAnyAttribute()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType <em>Thoroughfare Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Name Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType
	 * @generated
	 */
	EClass getThoroughfareNameType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getMixed()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getCode()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getType()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNameType#getAnyAttribute()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType <em>Thoroughfare Number From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number From Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType
	 * @generated
	 */
	EClass getThoroughfareNumberFromType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getMixed()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getAddressLine()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getThoroughfareNumber()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getCode()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberFromType#getAnyAttribute()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType <em>Thoroughfare Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Prefix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType
	 * @generated
	 */
	EClass getThoroughfareNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getMixed()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getCode()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getType()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType#getAnyAttribute()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType <em>Thoroughfare Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType
	 * @generated
	 */
	EClass getThoroughfareNumberRangeType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getAddressLine()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberFrom <em>Thoroughfare Number From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number From</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberFrom()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_ThoroughfareNumberFrom();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberTo <em>Thoroughfare Number To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number To</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberTo()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_ThoroughfareNumberTo();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getCode()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getIndicator()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence <em>Number Range Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Range Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_NumberRangeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getRangeType()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_RangeType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getSeparator()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getType()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberRangeType#getAnyAttribute()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType <em>Thoroughfare Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Suffix Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType
	 * @generated
	 */
	EClass getThoroughfareNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getMixed()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getCode()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getType()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType#getAnyAttribute()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType <em>Thoroughfare Number To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number To Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType
	 * @generated
	 */
	EClass getThoroughfareNumberToType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getMixed()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getAddressLine()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getThoroughfareNumber()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getCode()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberToType#getAnyAttribute()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType <em>Thoroughfare Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType
	 * @generated
	 */
	EClass getThoroughfareNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getMixed()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getCode()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getIndicator()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getIndicatorOccurrence()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getNumberOccurrence <em>Number Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Occurrence</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getNumberOccurrence()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_NumberOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getNumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getNumberType()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_NumberType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getType()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType#getAnyAttribute()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType <em>Thoroughfare Post Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Post Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType
	 * @generated
	 */
	EClass getThoroughfarePostDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getMixed()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getCode()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getType()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePostDirectionType#getAnyAttribute()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType <em>Thoroughfare Pre Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Pre Direction Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType
	 * @generated
	 */
	EClass getThoroughfarePreDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getMixed()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getCode()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getType()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfarePreDirectionType#getAnyAttribute()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType <em>Thoroughfare Trailing Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Trailing Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType
	 * @generated
	 */
	EClass getThoroughfareTrailingTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getMixed()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getCode()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getType()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareTrailingTypeType#getAnyAttribute()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType <em>Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType
	 * @generated
	 */
	EClass getThoroughfareType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getAddressLine()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_AddressLine();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getGroup()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumber()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumberRange <em>Thoroughfare Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Range</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumberRange()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberRange();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Pre Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfarePreDirection()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfarePreDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Leading Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareLeadingType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareLeadingType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareName()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Trailing Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfareTrailingType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareTrailingType();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Post Direction</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getThoroughfarePostDirection()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfarePostDirection();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfare <em>Dependent Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfare()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_DependentThoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentLocality()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getPremise()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getFirm()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getPostalCode()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getAny()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfares <em>Dependent Thoroughfares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfares()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfares();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfaresConnector <em>Dependent Thoroughfares Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Connector</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfaresConnector()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresConnector();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfaresIndicator <em>Dependent Thoroughfares Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Indicator</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfaresIndicator()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getDependentThoroughfaresType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresType();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType#getAnyAttribute()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getAddressDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressDetails();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Line</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getAddressLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getAdministrativeArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country Name</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getCountryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CountryName();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Department</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getDepartment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Department();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getLocality()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPostalCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPostBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPostOffice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremise()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremiseNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremiseNumberPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getPremiseNumberSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfare()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfareNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number Prefix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfareNumberPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number Suffix</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getThoroughfareNumberSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getXAL <em>XAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XAL</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot#getXAL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XAL();

	/**
	 * Returns the meta object for class '{@link oasis.names.tc.ciq.xsdschema.xAL.XALType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALType
	 * @generated
	 */
	EClass getXALType();

	/**
	 * Returns the meta object for the containment reference list '{@link oasis.names.tc.ciq.xsdschema.xAL.XALType#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Details</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALType#getAddressDetails()
	 * @see #getXALType()
	 * @generated
	 */
	EReference getXALType_AddressDetails();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.XALType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALType#getAny()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_Any();

	/**
	 * Returns the meta object for the attribute '{@link oasis.names.tc.ciq.xsdschema.xAL.XALType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALType#getVersion()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link oasis.names.tc.ciq.xsdschema.xAL.XALType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALType#getAnyAttribute()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependent Thoroughfares Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType
	 * @generated
	 */
	EEnum getDependentThoroughfaresType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType <em>Indicator Occurence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType
	 * @generated
	 */
	EEnum getIndicatorOccurenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType <em>Indicator Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1 <em>Indicator Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2 <em>Indicator Occurrence Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType2();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3 <em>Indicator Occurrence Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type3</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType3();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4 <em>Indicator Occurrence Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type4</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType4();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType <em>Name Number Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Number Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType
	 * @generated
	 */
	EEnum getNameNumberOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType <em>Number Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType
	 * @generated
	 */
	EEnum getNumberOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType <em>Number Range Occurence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Range Occurence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType
	 * @generated
	 */
	EEnum getNumberRangeOccurenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType <em>Number Range Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Range Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType
	 * @generated
	 */
	EEnum getNumberRangeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType <em>Number Type Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType
	 * @generated
	 */
	EEnum getNumberTypeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Occurrence Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1
	 * @generated
	 */
	EEnum getNumberTypeOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType <em>Number Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType
	 * @generated
	 */
	EEnum getNumberTypeType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1 <em>Number Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1
	 * @generated
	 */
	EEnum getNumberTypeType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType <em>Range Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Type Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType
	 * @generated
	 */
	EEnum getRangeTypeType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType <em>Type Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType
	 * @generated
	 */
	EEnum getTypeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1 <em>Type Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1
	 * @generated
	 */
	EEnum getTypeOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2 <em>Type Occurrence Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2
	 * @generated
	 */
	EEnum getTypeOccurrenceType2();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType <em>Dependent Thoroughfares Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dependent Thoroughfares Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.DependentThoroughfaresType"
	 *        extendedMetaData="name='DependentThoroughfares_._type:Object' baseType='DependentThoroughfares_._type'"
	 * @generated
	 */
	EDataType getDependentThoroughfaresTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType <em>Indicator Occurence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurenceType"
	 *        extendedMetaData="name='IndicatorOccurence_._type:Object' baseType='IndicatorOccurence_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1 <em>Indicator Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType1"
	 *        extendedMetaData="name='IndicatorOccurrence_._1_._type:Object' baseType='IndicatorOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2 <em>Indicator Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType2"
	 *        extendedMetaData="name='IndicatorOccurrence_._2_._type:Object' baseType='IndicatorOccurrence_._2_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType <em>Indicator Occurrence Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType"
	 *        extendedMetaData="name='IndicatorOccurrence_._type:Object' baseType='IndicatorOccurrence_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject2();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3 <em>Indicator Occurrence Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object3</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3"
	 *        extendedMetaData="name='IndicatorOccurrence_._3_._type:Object' baseType='IndicatorOccurrence_._3_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject3();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4 <em>Indicator Occurrence Type Object4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object4</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType4"
	 *        extendedMetaData="name='IndicatorOccurrence_._4_._type:Object' baseType='IndicatorOccurrence_._4_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject4();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType <em>Name Number Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Number Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType"
	 *        extendedMetaData="name='NameNumberOccurrence_._type:Object' baseType='NameNumberOccurrence_._type'"
	 * @generated
	 */
	EDataType getNameNumberOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType <em>Number Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NumberOccurrenceType"
	 *        extendedMetaData="name='NumberOccurrence_._type:Object' baseType='NumberOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType <em>Number Range Occurence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Range Occurence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurenceType"
	 *        extendedMetaData="name='NumberRangeOccurence_._type:Object' baseType='NumberRangeOccurence_._type'"
	 * @generated
	 */
	EDataType getNumberRangeOccurenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType <em>Number Range Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Range Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NumberRangeOccurrenceType"
	 *        extendedMetaData="name='NumberRangeOccurrence_._type:Object' baseType='NumberRangeOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberRangeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType <em>Number Type Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType"
	 *        extendedMetaData="name='NumberTypeOccurrence_._type:Object' baseType='NumberTypeOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberTypeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Occurrence Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1"
	 *        extendedMetaData="name='NumberTypeOccurrence_._1_._type:Object' baseType='NumberTypeOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getNumberTypeOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType <em>Number Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType"
	 *        extendedMetaData="name='NumberType_._type:Object' baseType='NumberType_._type'"
	 * @generated
	 */
	EDataType getNumberTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1 <em>Number Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType1"
	 *        extendedMetaData="name='NumberType_._1_._type:Object' baseType='NumberType_._1_._type'"
	 * @generated
	 */
	EDataType getNumberTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType <em>Range Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Type Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.RangeTypeType"
	 *        extendedMetaData="name='RangeType_._type:Object' baseType='RangeType_._type'"
	 * @generated
	 */
	EDataType getRangeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType <em>Type Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType"
	 *        extendedMetaData="name='TypeOccurrence_._type:Object' baseType='TypeOccurrence_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1 <em>Type Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object1</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1"
	 *        extendedMetaData="name='TypeOccurrence_._1_._type:Object' baseType='TypeOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2 <em>Type Occurrence Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object2</em>'.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2
	 * @model instanceClass="oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType2"
	 *        extendedMetaData="name='TypeOccurrence_._2_._type:Object' baseType='TypeOccurrence_._2_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XALFactory getXALFactory();

} //XALPackage
