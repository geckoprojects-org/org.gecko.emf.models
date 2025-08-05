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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.ServiceType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getKeywordList <em>Keyword List</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getFees <em>Fees</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getLayerLimit <em>Layer Limit</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.wms.ServiceType#getMaxHeight <em>Max Height</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getServiceType()
 * @model extendedMetaData="name='Service_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.wms.NameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see net.opengis.wms.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(NameType)
	 * @see net.opengis.wms.WMSPackage#getServiceType_Name()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see net.opengis.wms.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.ServiceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.ServiceType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Title is for informative display to a human.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.wms.WMSPackage#getServiceType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The abstract is a longer narrative description of an object.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see net.opengis.wms.WMSPackage#getServiceType_Abstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Keyword List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         List of keywords or keyword phrases to help catalog searching.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword List</em>' containment reference.
	 * @see #setKeywordList(KeywordListType)
	 * @see net.opengis.wms.WMSPackage#getServiceType_KeywordList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeywordList' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordListType getKeywordList();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getKeywordList <em>Keyword List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword List</em>' containment reference.
	 * @see #getKeywordList()
	 * @generated
	 */
	void setKeywordList(KeywordListType value);

	/**
	 * Returns the value of the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An OnlineResource is typically an HTTP URL.  The URL is placed in
	 *         the xlink:href attribute, and the value "simple" is placed in the
	 *         xlink:type attribute.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Online Resource</em>' containment reference.
	 * @see #setOnlineResource(OnlineResourceType)
	 * @see net.opengis.wms.WMSPackage#getServiceType_OnlineResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OnlineResource' namespace='##targetNamespace'"
	 * @generated
	 */
	OnlineResourceType getOnlineResource();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getOnlineResource <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Resource</em>' containment reference.
	 * @see #getOnlineResource()
	 * @generated
	 */
	void setOnlineResource(OnlineResourceType value);

	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Information about a contact person for the service.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information</em>' containment reference.
	 * @see #setContactInformation(ContactInformationType)
	 * @see net.opengis.wms.WMSPackage#getServiceType_ContactInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactInformationType getContactInformation();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getContactInformation <em>Contact Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Information</em>' containment reference.
	 * @see #getContactInformation()
	 * @generated
	 */
	void setContactInformation(ContactInformationType value);

	/**
	 * Returns the value of the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fees</em>' attribute.
	 * @see #setFees(String)
	 * @see net.opengis.wms.WMSPackage#getServiceType_Fees()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Fees' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFees();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getFees <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fees</em>' attribute.
	 * @see #getFees()
	 * @generated
	 */
	void setFees(String value);

	/**
	 * Returns the value of the '<em><b>Access Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Constraints</em>' attribute.
	 * @see #setAccessConstraints(String)
	 * @see net.opengis.wms.WMSPackage#getServiceType_AccessConstraints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AccessConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessConstraints();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getAccessConstraints <em>Access Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Constraints</em>' attribute.
	 * @see #getAccessConstraints()
	 * @generated
	 */
	void setAccessConstraints(String value);

	/**
	 * Returns the value of the '<em><b>Layer Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Limit</em>' attribute.
	 * @see #setLayerLimit(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getServiceType_LayerLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='LayerLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLayerLimit();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getLayerLimit <em>Layer Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Limit</em>' attribute.
	 * @see #getLayerLimit()
	 * @generated
	 */
	void setLayerLimit(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #setMaxWidth(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getServiceType_MaxWidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='MaxWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxWidth();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getServiceType_MaxHeight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='MaxHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxHeight();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ServiceType#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(BigInteger value);

} // ServiceType
