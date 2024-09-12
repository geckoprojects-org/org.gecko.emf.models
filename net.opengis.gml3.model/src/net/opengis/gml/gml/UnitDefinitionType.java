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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.UnitDefinitionType#getQuantityType <em>Quantity Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.UnitDefinitionType#getQuantityTypeReference <em>Quantity Type Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.UnitDefinitionType#getCatalogSymbol <em>Catalog Symbol</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getUnitDefinitionType()
 * @model extendedMetaData="name='UnitDefinitionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnitDefinitionType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Quantity Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:quantityType property indicates the phenomenon to which the units apply. This element contains an informal description of the phenomenon or type of physical quantity that is measured or observed. When the physical quantity is the result of an observation or measurement, this term is known as observable type or measurand.
	 * The use of gml:quantityType for references to remote values is deprecated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Type</em>' containment reference.
	 * @see #setQuantityType(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getUnitDefinitionType_QuantityType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantityType' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getQuantityType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.UnitDefinitionType#getQuantityType <em>Quantity Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Type</em>' containment reference.
	 * @see #getQuantityType()
	 * @generated
	 */
	void setQuantityType(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Quantity Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:quantityTypeReference property indicates the phenomenon to which the units apply. The content is a reference to a remote value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Type Reference</em>' containment reference.
	 * @see #setQuantityTypeReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getUnitDefinitionType_QuantityTypeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantityTypeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getQuantityTypeReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.UnitDefinitionType#getQuantityTypeReference <em>Quantity Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Type Reference</em>' containment reference.
	 * @see #getQuantityTypeReference()
	 * @generated
	 */
	void setQuantityTypeReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Catalog Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The catalogSymbol is the preferred lexical symbol used for this unit of measure.
	 * The codeSpace attribute in gml:CodeType identifies a namespace for the catalog symbol value, and might reference the external catalog. The string value in gml:CodeType contains the value of a symbol that should be unique within this catalog namespace. This symbol often appears explicitly in the catalog, but it could be a combination of symbols using a specified algebra of units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalog Symbol</em>' containment reference.
	 * @see #setCatalogSymbol(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getUnitDefinitionType_CatalogSymbol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='catalogSymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCatalogSymbol();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.UnitDefinitionType#getCatalogSymbol <em>Catalog Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Symbol</em>' containment reference.
	 * @see #getCatalogSymbol()
	 * @generated
	 */
	void setCatalogSymbol(CodeType value);

} // UnitDefinitionType
