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
package org.open.oasis.docs.odata.ns.edmx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEdmx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getReference <em>Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getDataServices <em>Data Services</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTEdmx()
 * @model extendedMetaData="name='TEdmx' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TEdmx extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edmx.TReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTEdmx_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TReference> getReference();

	/**
	 * Returns the value of the '<em><b>Data Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Services</em>' containment reference.
	 * @see #setDataServices(TDataServices)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTEdmx_DataServices()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataServices' namespace='##targetNamespace'"
	 * @generated
	 */
	TDataServices getDataServices();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getDataServices <em>Data Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Services</em>' containment reference.
	 * @see #getDataServices()
	 * @generated
	 */
	void setDataServices(TDataServices value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link org.open.oasis.docs.odata.ns.edmx.TVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(TVersion)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTEdmx_Version()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Version'"
	 * @generated
	 */
	TVersion getVersion();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(TVersion value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(TVersion)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(TVersion)
	 * @generated
	 */
	boolean isSetVersion();

} // TEdmx
