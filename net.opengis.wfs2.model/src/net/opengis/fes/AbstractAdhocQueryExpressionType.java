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

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Adhoc Query Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAbstractProjectionClauseGroup <em>Abstract Projection Clause Group</em>}</li>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAbstractProjectionClause <em>Abstract Projection Clause</em>}</li>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAbstractSelectionClauseGroup <em>Abstract Selection Clause Group</em>}</li>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAbstractSelectionClause <em>Abstract Selection Clause</em>}</li>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAbstractSortingClauseGroup <em>Abstract Sorting Clause Group</em>}</li>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAbstractSortingClause <em>Abstract Sorting Clause</em>}</li>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAliases <em>Aliases</em>}</li>
 *   <li>{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getTypeNames <em>Type Names</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractAdhocQueryExpressionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractAdhocQueryExpressionType extends AbstractQueryExpressionType {
	/**
	 * Returns the value of the '<em><b>Abstract Projection Clause Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Projection Clause Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_AbstractProjectionClauseGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractProjectionClause:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractProjectionClauseGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Projection Clause</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Projection Clause</em>' containment reference list.
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_AbstractProjectionClause()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractProjectionClause' namespace='##targetNamespace' group='AbstractProjectionClause:group'"
	 * @generated
	 */
	EList<EObject> getAbstractProjectionClause();

	/**
	 * Returns the value of the '<em><b>Abstract Selection Clause Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Selection Clause Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_AbstractSelectionClauseGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractSelectionClause:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractSelectionClauseGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Selection Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Selection Clause</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_AbstractSelectionClause()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSelectionClause' namespace='##targetNamespace' group='AbstractSelectionClause:group'"
	 * @generated
	 */
	EObject getAbstractSelectionClause();

	/**
	 * Returns the value of the '<em><b>Abstract Sorting Clause Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sorting Clause Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_AbstractSortingClauseGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractSortingClause:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractSortingClauseGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Sorting Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sorting Clause</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_AbstractSortingClause()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSortingClause' namespace='##targetNamespace' group='AbstractSortingClause:group'"
	 * @generated
	 */
	EObject getAbstractSortingClause();

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' attribute.
	 * @see #setAliases(List)
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_Aliases()
	 * @model dataType="net.opengis.fes.AliasesType" many="false"
	 *        extendedMetaData="kind='attribute' name='aliases'"
	 * @generated
	 */
	List<String> getAliases();

	/**
	 * Sets the value of the '{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getAliases <em>Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aliases</em>' attribute.
	 * @see #getAliases()
	 * @generated
	 */
	void setAliases(List<String> value);

	/**
	 * Returns the value of the '<em><b>Type Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Names</em>' attribute.
	 * @see #setTypeNames(List)
	 * @see net.opengis.fes.FESPackage#getAbstractAdhocQueryExpressionType_TypeNames()
	 * @model dataType="net.opengis.fes.TypeNamesListType" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='typeNames'"
	 * @generated
	 */
	List<Object> getTypeNames();

	/**
	 * Sets the value of the '{@link net.opengis.fes.AbstractAdhocQueryExpressionType#getTypeNames <em>Type Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Names</em>' attribute.
	 * @see #getTypeNames()
	 * @generated
	 */
	void setTypeNames(List<Object> value);

} // AbstractAdhocQueryExpressionType
