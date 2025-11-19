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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOn Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOnDelete#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TOnDelete#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOnDelete()
 * @model extendedMetaData="name='TOnDelete' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TOnDelete extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOnDelete_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.open.oasis.docs.odata.ns.edm.TOnDeleteAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDeleteAction
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(TOnDeleteAction)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTOnDelete_Action()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Action'"
	 * @generated
	 */
	TOnDeleteAction getAction();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOnDelete#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDeleteAction
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(TOnDeleteAction value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOnDelete#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(TOnDeleteAction)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TOnDelete#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(TOnDeleteAction)
	 * @generated
	 */
	boolean isSetAction();

} // TOnDelete
