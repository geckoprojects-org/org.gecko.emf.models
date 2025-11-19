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
package org.open.oasis.docs.odata.ns.edm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TNavigation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getReferentialConstraint <em>Referential Constraint</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isContainsTarget <em>Contains Target</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getPartner <em>Partner</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty()
 * @model extendedMetaData="name='TNavigationProperty' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TNavigationProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Referential Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referential Constraint</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_ReferentialConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferentialConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TReferentialConstraint> getReferentialConstraint();

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TOnDelete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_OnDelete()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OnDelete' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TOnDelete> getOnDelete();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Contains Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Target</em>' attribute.
	 * @see #isSetContainsTarget()
	 * @see #unsetContainsTarget()
	 * @see #setContainsTarget(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_ContainsTarget()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ContainsTarget'"
	 * @generated
	 */
	boolean isContainsTarget();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isContainsTarget <em>Contains Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Target</em>' attribute.
	 * @see #isSetContainsTarget()
	 * @see #unsetContainsTarget()
	 * @see #isContainsTarget()
	 * @generated
	 */
	void setContainsTarget(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isContainsTarget <em>Contains Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainsTarget()
	 * @see #isContainsTarget()
	 * @see #setContainsTarget(boolean)
	 * @generated
	 */
	void unsetContainsTarget();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isContainsTarget <em>Contains Target</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contains Target</em>' attribute is set.
	 * @see #unsetContainsTarget()
	 * @see #isContainsTarget()
	 * @see #setContainsTarget(boolean)
	 * @generated
	 */
	boolean isSetContainsTarget();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #setNullable(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_Nullable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Nullable'"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isSetNullable()
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	void unsetNullable();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isNullable <em>Nullable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nullable</em>' attribute is set.
	 * @see #unsetNullable()
	 * @see #isNullable()
	 * @see #setNullable(boolean)
	 * @generated
	 */
	boolean isSetNullable();

	/**
	 * Returns the value of the '<em><b>Partner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' attribute.
	 * @see #setPartner(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_Partner()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath"
	 *        extendedMetaData="kind='attribute' name='Partner'"
	 * @generated
	 */
	String getPartner();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getPartner <em>Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner</em>' attribute.
	 * @see #getPartner()
	 * @generated
	 */
	void setPartner(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationProperty_Type()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TTypeName" required="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

} // TNavigationProperty
