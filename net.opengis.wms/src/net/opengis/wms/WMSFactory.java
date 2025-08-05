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
package net.opengis.wms;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.wms.WMSPackage
 * @generated
 */
@ProviderType
public interface WMSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WMSFactory eINSTANCE = net.opengis.wms.impl.WMSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribution Type</em>'.
	 * @generated
	 */
	AttributionType createAttributionType();

	/**
	 * Returns a new object of class '<em>Authority URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority URL Type</em>'.
	 * @generated
	 */
	AuthorityURLType createAuthorityURLType();

	/**
	 * Returns a new object of class '<em>Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounding Box Type</em>'.
	 * @generated
	 */
	BoundingBoxType createBoundingBoxType();

	/**
	 * Returns a new object of class '<em>Capability Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Type</em>'.
	 * @generated
	 */
	CapabilityType createCapabilityType();

	/**
	 * Returns a new object of class '<em>Contact Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Address Type</em>'.
	 * @generated
	 */
	ContactAddressType createContactAddressType();

	/**
	 * Returns a new object of class '<em>Contact Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Information Type</em>'.
	 * @generated
	 */
	ContactInformationType createContactInformationType();

	/**
	 * Returns a new object of class '<em>Contact Person Primary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Person Primary Type</em>'.
	 * @generated
	 */
	ContactPersonPrimaryType createContactPersonPrimaryType();

	/**
	 * Returns a new object of class '<em>Data URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data URL Type</em>'.
	 * @generated
	 */
	DataURLType createDataURLType();

	/**
	 * Returns a new object of class '<em>DCP Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCP Type Type</em>'.
	 * @generated
	 */
	DCPTypeType createDCPTypeType();

	/**
	 * Returns a new object of class '<em>Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Type</em>'.
	 * @generated
	 */
	DimensionType createDimensionType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Type</em>'.
	 * @generated
	 */
	ExceptionType createExceptionType();

	/**
	 * Returns a new object of class '<em>EX Geographic Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EX Geographic Bounding Box Type</em>'.
	 * @generated
	 */
	EXGeographicBoundingBoxType createEXGeographicBoundingBoxType();

	/**
	 * Returns a new object of class '<em>Feature List URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature List URL Type</em>'.
	 * @generated
	 */
	FeatureListURLType createFeatureListURLType();

	/**
	 * Returns a new object of class '<em>Get Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Type</em>'.
	 * @generated
	 */
	GetType createGetType();

	/**
	 * Returns a new object of class '<em>HTTP Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Type</em>'.
	 * @generated
	 */
	HTTPType createHTTPType();

	/**
	 * Returns a new object of class '<em>Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Type</em>'.
	 * @generated
	 */
	IdentifierType createIdentifierType();

	/**
	 * Returns a new object of class '<em>Keyword List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword List Type</em>'.
	 * @generated
	 */
	KeywordListType createKeywordListType();

	/**
	 * Returns a new object of class '<em>Keyword Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword Type</em>'.
	 * @generated
	 */
	KeywordType createKeywordType();

	/**
	 * Returns a new object of class '<em>Layer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer Type</em>'.
	 * @generated
	 */
	LayerType createLayerType();

	/**
	 * Returns a new object of class '<em>Legend URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legend URL Type</em>'.
	 * @generated
	 */
	LegendURLType createLegendURLType();

	/**
	 * Returns a new object of class '<em>Logo URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logo URL Type</em>'.
	 * @generated
	 */
	LogoURLType createLogoURLType();

	/**
	 * Returns a new object of class '<em>Metadata URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata URL Type</em>'.
	 * @generated
	 */
	MetadataURLType createMetadataURLType();

	/**
	 * Returns a new object of class '<em>Online Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Online Resource Type</em>'.
	 * @generated
	 */
	OnlineResourceType createOnlineResourceType();

	/**
	 * Returns a new object of class '<em>Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Type</em>'.
	 * @generated
	 */
	OperationType createOperationType();

	/**
	 * Returns a new object of class '<em>Post Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Type</em>'.
	 * @generated
	 */
	PostType createPostType();

	/**
	 * Returns a new object of class '<em>Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Type</em>'.
	 * @generated
	 */
	RequestType createRequestType();

	/**
	 * Returns a new object of class '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Type</em>'.
	 * @generated
	 */
	ServiceType createServiceType();

	/**
	 * Returns a new object of class '<em>Style Sheet URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Sheet URL Type</em>'.
	 * @generated
	 */
	StyleSheetURLType createStyleSheetURLType();

	/**
	 * Returns a new object of class '<em>Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Type</em>'.
	 * @generated
	 */
	StyleType createStyleType();

	/**
	 * Returns a new object of class '<em>Style URL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style URL Type</em>'.
	 * @generated
	 */
	StyleURLType createStyleURLType();

	/**
	 * Returns a new object of class '<em>Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capabilities Type</em>'.
	 * @generated
	 */
	WMSCapabilitiesType createWMSCapabilitiesType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WMSPackage getWMSPackage();

} //WMSFactory
