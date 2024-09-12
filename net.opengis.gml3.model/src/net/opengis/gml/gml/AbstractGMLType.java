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
package net.opengis.gml.gml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract GML Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractGMLType#getMetaDataProperty <em>Meta Data Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractGMLType#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractGMLType#getDescriptionReference <em>Description Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractGMLType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractGMLType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractGMLType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractGMLType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGMLType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractGMLType extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.MetaDataPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Property</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGMLType_MetaDataProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metaDataProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetaDataPropertyType> getMetaDataProperty();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property is a text description of the object. gml:description uses gml:StringOrRefType as its content model, so it may contain a simple text string content, or carry a reference to an external description. The use of gml:description to reference an external description has been deprecated and replaced by the gml:descriptionReference property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGMLType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractGMLType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Description Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property is a remote text description of the object. The xlink:href attribute of the gml:descriptionReference property references the external description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Reference</em>' containment reference.
	 * @see #setDescriptionReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGMLType_DescriptionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descriptionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDescriptionReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractGMLType#getDescriptionReference <em>Description Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Reference</em>' containment reference.
	 * @see #getDescriptionReference()
	 * @generated
	 */
	void setDescriptionReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Often, a special identifier is assigned to an object by the maintaining authority with the intention that it is used in references to the object For such cases, the codeSpace shall be provided. That identifier is usually unique either globally or within an application domain. gml:identifier is a pre-defined property for such identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(CodeWithAuthorityType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGMLType_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeWithAuthorityType getIdentifier();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractGMLType#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(CodeWithAuthorityType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:name property provides a label or identifier for the object, commonly a descriptive name. An object may have several names, typically assigned by different authorities. gml:name uses the gml:CodeType content model.  The authority for a name is indicated by the value of its (optional) codeSpace attribute.  The name may or may not be unique, as determined by the rules of the organization responsible for the codeSpace.  In common usage there will be one name per authority, so a processing application may select the name from its preferred codeSpace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGMLType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeType> getName();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribute gml:id supports provision of a handle for the XML element representing a GML Object. Its use is mandatory for all GML objects. It is of XML type ID, so is constrained to be unique in the XML document within which it occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGMLType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractGMLType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AbstractGMLType
