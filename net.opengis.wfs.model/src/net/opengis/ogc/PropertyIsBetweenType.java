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
package net.opengis.ogc;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Is Between Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.PropertyIsBetweenType#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link net.opengis.ogc.PropertyIsBetweenType#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.ogc.PropertyIsBetweenType#getLowerBoundary <em>Lower Boundary</em>}</li>
 *   <li>{@link net.opengis.ogc.PropertyIsBetweenType#getUpperBoundary <em>Upper Boundary</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getPropertyIsBetweenType()
 * @model extendedMetaData="name='PropertyIsBetweenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PropertyIsBetweenType extends ComparisonOpsType {
	/**
	 * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getPropertyIsBetweenType_ExpressionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='expression:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getPropertyIsBetweenType_Expression()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='expression:group'"
	 * @generated
	 */
	ExpressionType getExpression();

	/**
	 * Returns the value of the '<em><b>Lower Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Boundary</em>' containment reference.
	 * @see #setLowerBoundary(LowerBoundaryType)
	 * @see net.opengis.ogc.OGCPackage#getPropertyIsBetweenType_LowerBoundary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LowerBoundary' namespace='##targetNamespace'"
	 * @generated
	 */
	LowerBoundaryType getLowerBoundary();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.PropertyIsBetweenType#getLowerBoundary <em>Lower Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Boundary</em>' containment reference.
	 * @see #getLowerBoundary()
	 * @generated
	 */
	void setLowerBoundary(LowerBoundaryType value);

	/**
	 * Returns the value of the '<em><b>Upper Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Boundary</em>' containment reference.
	 * @see #setUpperBoundary(UpperBoundaryType)
	 * @see net.opengis.ogc.OGCPackage#getPropertyIsBetweenType_UpperBoundary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpperBoundary' namespace='##targetNamespace'"
	 * @generated
	 */
	UpperBoundaryType getUpperBoundary();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.PropertyIsBetweenType#getUpperBoundary <em>Upper Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Boundary</em>' containment reference.
	 * @see #getUpperBoundary()
	 * @generated
	 */
	void setUpperBoundary(UpperBoundaryType value);

} // PropertyIsBetweenType
