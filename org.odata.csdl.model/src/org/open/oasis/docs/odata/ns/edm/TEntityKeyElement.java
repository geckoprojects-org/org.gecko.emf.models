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
 * A representation of the model object '<em><b>TEntity Key Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEntityKeyElement#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntityKeyElement()
 * @model extendedMetaData="name='TEntityKeyElement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TEntityKeyElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TPropertyRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntityKeyElement_PropertyRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TPropertyRef> getPropertyRef();

} // TEntityKeyElement
