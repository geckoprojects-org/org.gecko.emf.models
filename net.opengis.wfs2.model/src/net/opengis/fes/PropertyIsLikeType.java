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
package net.opengis.fes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Is Like Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.PropertyIsLikeType#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link net.opengis.fes.PropertyIsLikeType#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.fes.PropertyIsLikeType#getEscapeChar <em>Escape Char</em>}</li>
 *   <li>{@link net.opengis.fes.PropertyIsLikeType#isMatchCase <em>Match Case</em>}</li>
 *   <li>{@link net.opengis.fes.PropertyIsLikeType#getSingleChar <em>Single Char</em>}</li>
 *   <li>{@link net.opengis.fes.PropertyIsLikeType#getWildCard <em>Wild Card</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getPropertyIsLikeType()
 * @model extendedMetaData="name='PropertyIsLikeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PropertyIsLikeType extends ComparisonOpsType {
	/**
	 * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getPropertyIsLikeType_ExpressionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" lower="2" upper="2"
	 *        extendedMetaData="kind='group' name='expression:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see net.opengis.fes.FESPackage#getPropertyIsLikeType_Expression()
	 * @model containment="true" lower="2" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='expression:group'"
	 * @generated
	 */
	EList<EObject> getExpression();

	/**
	 * Returns the value of the '<em><b>Escape Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape Char</em>' attribute.
	 * @see #setEscapeChar(String)
	 * @see net.opengis.fes.FESPackage#getPropertyIsLikeType_EscapeChar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='escapeChar'"
	 * @generated
	 */
	String getEscapeChar();

	/**
	 * Sets the value of the '{@link net.opengis.fes.PropertyIsLikeType#getEscapeChar <em>Escape Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Char</em>' attribute.
	 * @see #getEscapeChar()
	 * @generated
	 */
	void setEscapeChar(String value);

	/**
	 * Returns the value of the '<em><b>Match Case</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Case</em>' attribute.
	 * @see #isSetMatchCase()
	 * @see #unsetMatchCase()
	 * @see #setMatchCase(boolean)
	 * @see net.opengis.fes.FESPackage#getPropertyIsLikeType_MatchCase()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='matchCase'"
	 * @generated
	 */
	boolean isMatchCase();

	/**
	 * Sets the value of the '{@link net.opengis.fes.PropertyIsLikeType#isMatchCase <em>Match Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Case</em>' attribute.
	 * @see #isSetMatchCase()
	 * @see #unsetMatchCase()
	 * @see #isMatchCase()
	 * @generated
	 */
	void setMatchCase(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.fes.PropertyIsLikeType#isMatchCase <em>Match Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatchCase()
	 * @see #isMatchCase()
	 * @see #setMatchCase(boolean)
	 * @generated
	 */
	void unsetMatchCase();

	/**
	 * Returns whether the value of the '{@link net.opengis.fes.PropertyIsLikeType#isMatchCase <em>Match Case</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Match Case</em>' attribute is set.
	 * @see #unsetMatchCase()
	 * @see #isMatchCase()
	 * @see #setMatchCase(boolean)
	 * @generated
	 */
	boolean isSetMatchCase();

	/**
	 * Returns the value of the '<em><b>Single Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Char</em>' attribute.
	 * @see #setSingleChar(String)
	 * @see net.opengis.fes.FESPackage#getPropertyIsLikeType_SingleChar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='singleChar'"
	 * @generated
	 */
	String getSingleChar();

	/**
	 * Sets the value of the '{@link net.opengis.fes.PropertyIsLikeType#getSingleChar <em>Single Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Char</em>' attribute.
	 * @see #getSingleChar()
	 * @generated
	 */
	void setSingleChar(String value);

	/**
	 * Returns the value of the '<em><b>Wild Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wild Card</em>' attribute.
	 * @see #setWildCard(String)
	 * @see net.opengis.fes.FESPackage#getPropertyIsLikeType_WildCard()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='wildCard'"
	 * @generated
	 */
	String getWildCard();

	/**
	 * Sets the value of the '{@link net.opengis.fes.PropertyIsLikeType#getWildCard <em>Wild Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wild Card</em>' attribute.
	 * @see #getWildCard()
	 * @generated
	 */
	void setWildCard(String value);

} // PropertyIsLikeType
