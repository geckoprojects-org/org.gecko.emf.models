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
package org.cyclonedx.schema.bom;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.IdentityType#getField <em>Field</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.IdentityType#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.IdentityType#getConcludedValue <em>Concluded Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.IdentityType#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.IdentityType#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentityType()
 * @model extendedMetaData="name='identity_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.IdentityFieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identity field of the component which the evidence describes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see org.cyclonedx.schema.bom.IdentityFieldType
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #setField(IdentityFieldType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentityType_Field()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentityFieldType getField();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.IdentityType#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see org.cyclonedx.schema.bom.IdentityFieldType
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #getField()
	 * @generated
	 */
	void setField(IdentityFieldType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.IdentityType#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetField()
	 * @see #getField()
	 * @see #setField(IdentityFieldType)
	 * @generated
	 */
	void unsetField();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.IdentityType#getField <em>Field</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field</em>' attribute is set.
	 * @see #unsetField()
	 * @see #getField()
	 * @see #setField(IdentityFieldType)
	 * @generated
	 */
	boolean isSetField();

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overall confidence of the evidence from 0 - 1, where 1 is 100% confidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(BigDecimal)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentityType_Confidence()
	 * @model dataType="org.cyclonedx.schema.bom.DecimalPercentType"
	 *        extendedMetaData="kind='element' name='confidence' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getConfidence();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.IdentityType#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Concluded Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the field (cpe, purl, etc) that has been concluded based on the aggregate of all methods (if available).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concluded Value</em>' attribute.
	 * @see #setConcludedValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentityType_ConcludedValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='concludedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConcludedValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.IdentityType#getConcludedValue <em>Concluded Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concluded Value</em>' attribute.
	 * @see #getConcludedValue()
	 * @generated
	 */
	void setConcludedValue(String value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The methods used to extract and/or analyze the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference.
	 * @see #setMethods(MethodsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentityType_Methods()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='methods' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodsType getMethods();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.IdentityType#getMethods <em>Methods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methods</em>' containment reference.
	 * @see #getMethods()
	 * @generated
	 */
	void setMethods(MethodsType value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The object in the BOM identified by its bom-ref. This is often a component or service,
	 *                                     but may be any object type supporting bom-refs. Tools used for analysis should already
	 *                                     be defined in the BOM, either in the metadata/tools, components, or formulation.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference.
	 * @see #setTools(ToolsType2)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentityType_Tools()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tools' namespace='##targetNamespace'"
	 * @generated
	 */
	ToolsType2 getTools();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.IdentityType#getTools <em>Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tools</em>' containment reference.
	 * @see #getTools()
	 * @generated
	 */
	void setTools(ToolsType2 value);

} // IdentityType
