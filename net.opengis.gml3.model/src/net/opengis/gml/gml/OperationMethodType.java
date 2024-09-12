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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.OperationMethodType#getFormulaCitation <em>Formula Citation</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationMethodType#getFormulaGroup <em>Formula Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationMethodType#getFormula <em>Formula</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationMethodType#getSourceDimensions <em>Source Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationMethodType#getTargetDimensions <em>Target Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationMethodType#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationMethodType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType()
 * @model extendedMetaData="name='OperationMethodType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OperationMethodType extends IdentifiedObjectType {
	/**
	 * Returns the value of the '<em><b>Formula Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:formulaCitation provides a reference to a publication giving the formula(s) or procedure used by an coordinate operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula Citation</em>' containment reference.
	 * @see #setFormulaCitation(FormulaCitationType)
	 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType_FormulaCitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formulaCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormulaCitationType getFormulaCitation();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OperationMethodType#getFormulaCitation <em>Formula Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula Citation</em>' containment reference.
	 * @see #getFormulaCitation()
	 * @generated
	 */
	void setFormulaCitation(FormulaCitationType value);

	/**
	 * Returns the value of the '<em><b>Formula Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:formula Formula(s) or procedure used by an operation method. The use of the codespace attribite has been deprecated. The property value shall be a character string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType_FormulaGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='formula:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFormulaGroup();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:formula Formula(s) or procedure used by an operation method. The use of the codespace attribite has been deprecated. The property value shall be a character string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(CodeType)
	 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType_Formula()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formula' namespace='##targetNamespace' group='formula:group'"
	 * @generated
	 */
	CodeType getFormula();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OperationMethodType#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(CodeType value);

	/**
	 * Returns the value of the '<em><b>Source Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sourceDimensions is the number of dimensions in the source CRS of this operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Dimensions</em>' attribute.
	 * @see #setSourceDimensions(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType_SourceDimensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='sourceDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSourceDimensions();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OperationMethodType#getSourceDimensions <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Dimensions</em>' attribute.
	 * @see #getSourceDimensions()
	 * @generated
	 */
	void setSourceDimensions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Target Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:targetDimensions is the number of dimensions in the target CRS of this operation method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Dimensions</em>' attribute.
	 * @see #setTargetDimensions(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType_TargetDimensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='targetDimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTargetDimensions();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OperationMethodType#getTargetDimensions <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Dimensions</em>' attribute.
	 * @see #getTargetDimensions()
	 * @generated
	 */
	void setTargetDimensions(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Parameter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameter is an association to an operation parameter or parameter group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType_ParameterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='parameter:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getParameterGroup();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.AbstractGeneralOperationParameterPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameter is an association to an operation parameter or parameter group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getOperationMethodType_Parameter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace' group='parameter:group'"
	 * @generated
	 */
	EList<AbstractGeneralOperationParameterPropertyType> getParameter();

} // OperationMethodType
