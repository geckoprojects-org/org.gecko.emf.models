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
package net.opengis.kml;

import oasis.names.tc.ciq.xsdschema.xAL.AddressDetails;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2005.atom.AtomPersonConstruct;
import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#isOpen <em>Open</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAddressDetails <em>Address Details</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getSnippet1 <em>Snippet1</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractViewGroupGroup <em>Abstract View Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractViewGroup <em>Abstract View Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractTimePrimitiveGroupGroup <em>Abstract Time Primitive Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractTimePrimitiveGroup <em>Abstract Time Primitive Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractStyleSelectorGroupGroup <em>Abstract Style Selector Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getRegion <em>Region</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureSimpleExtensionGroupGroup <em>Abstract Feature Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureSimpleExtensionGroup <em>Abstract Feature Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureObjectExtensionGroupGroup <em>Abstract Feature Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureObjectExtensionGroup <em>Abstract Feature Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractFeatureType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractFeatureType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(boolean)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Visibility()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVisibility();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#isVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #isVisibility()
	 * @generated
	 */
	void setVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractFeatureType#isVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #isVisibility()
	 * @see #setVisibility(boolean)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractFeatureType#isVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #isVisibility()
	 * @see #setVisibility(boolean)
	 * @generated
	 */
	boolean isSetVisibility();

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #isSetOpen()
	 * @see #unsetOpen()
	 * @see #setOpen(boolean)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Open()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='open' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isSetOpen()
	 * @see #unsetOpen()
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractFeatureType#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpen()
	 * @see #isOpen()
	 * @see #setOpen(boolean)
	 * @generated
	 */
	void unsetOpen();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractFeatureType#isOpen <em>Open</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Open</em>' attribute is set.
	 * @see #unsetOpen()
	 * @see #isOpen()
	 * @see #setOpen(boolean)
	 * @generated
	 */
	boolean isSetOpen();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(AtomPersonConstruct)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='http://www.w3.org/2005/Atom'"
	 * @generated
	 */
	AtomPersonConstruct getAuthor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(AtomPersonConstruct value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='http://www.w3.org/2005/Atom'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Address()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This container defines the details of the address. Can define multiple addresses including tracking address history
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Details</em>' containment reference.
	 * @see #setAddressDetails(AddressDetails)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AddressDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressDetails' namespace='urn:oasis:names:tc:ciq:xsdschema:xAL:2.0'"
	 * @generated
	 */
	AddressDetails getAddressDetails();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getAddressDetails <em>Address Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Details</em>' containment reference.
	 * @see #getAddressDetails()
	 * @generated
	 */
	void setAddressDetails(AddressDetails value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_PhoneNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='phoneNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet</em>' containment reference.
	 * @see #setSnippet(SnippetType)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Snippet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Snippet' namespace='##targetNamespace'"
	 * @generated
	 */
	SnippetType getSnippet();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getSnippet <em>Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet</em>' containment reference.
	 * @see #getSnippet()
	 * @generated
	 */
	void setSnippet(SnippetType value);

	/**
	 * Returns the value of the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet1</em>' attribute.
	 * @see #setSnippet1(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Snippet1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='snippet' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSnippet1();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getSnippet1 <em>Snippet1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet1</em>' attribute.
	 * @see #getSnippet1()
	 * @generated
	 */
	void setSnippet1(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractViewGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractViewGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractViewGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractViewGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractViewGroup' namespace='##targetNamespace' group='AbstractViewGroup:group'"
	 * @generated
	 */
	AbstractViewType getAbstractViewGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Time Primitive Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractTimePrimitiveGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractTimePrimitiveGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractTimePrimitiveGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Time Primitive Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractTimePrimitiveGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractTimePrimitiveGroup' namespace='##targetNamespace' group='AbstractTimePrimitiveGroup:group'"
	 * @generated
	 */
	AbstractTimePrimitiveType getAbstractTimePrimitiveGroup();

	/**
	 * Returns the value of the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Url</em>' attribute.
	 * @see #setStyleUrl(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_StyleUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='styleUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleUrl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getStyleUrl <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Url</em>' attribute.
	 * @see #getStyleUrl()
	 * @generated
	 */
	void setStyleUrl(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractStyleSelectorGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractStyleSelectorGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractStyleSelectorGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractStyleSelectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractStyleSelectorGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractStyleSelectorGroup' namespace='##targetNamespace' group='AbstractStyleSelectorGroup:group'"
	 * @generated
	 */
	EList<AbstractStyleSelectorType> getAbstractStyleSelectorGroup();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(RegionType)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Region()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace'"
	 * @generated
	 */
	RegionType getRegion();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(RegionType value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadata deprecated in 2.2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' containment reference.
	 * @see #setExtendedData(ExtendedDataType)
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_ExtendedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtendedData' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedDataType getExtendedData();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractFeatureType#getExtendedData <em>Extended Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Data</em>' containment reference.
	 * @see #getExtendedData()
	 * @generated
	 */
	void setExtendedData(ExtendedDataType value);

	/**
	 * Returns the value of the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractFeatureSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractFeatureSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractFeatureSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractFeatureSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureSimpleExtensionGroup' namespace='##targetNamespace' group='AbstractFeatureSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractFeatureSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractFeatureObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractFeatureObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractFeatureObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractFeatureType_AbstractFeatureObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureObjectExtensionGroup' namespace='##targetNamespace' group='AbstractFeatureObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractFeatureObjectExtensionGroup();

} // AbstractFeatureType
