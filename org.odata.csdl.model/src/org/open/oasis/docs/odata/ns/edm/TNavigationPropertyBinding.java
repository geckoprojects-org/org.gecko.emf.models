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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TNavigation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getPath <em>Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationPropertyBinding()
 * @model extendedMetaData="name='TNavigationPropertyBinding' kind='empty'"
 * @generated
 */
@ProviderType
public interface TNavigationPropertyBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationPropertyBinding_Path()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath" required="true"
	 *        extendedMetaData="kind='attribute' name='Path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTNavigationPropertyBinding_Target()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath" required="true"
	 *        extendedMetaData="kind='attribute' name='Target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // TNavigationPropertyBinding
