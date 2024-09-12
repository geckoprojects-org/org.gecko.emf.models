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
package net.opengis.ows;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.DCPType#getHTTP <em>HTTP</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getDCPType()
 * @model extendedMetaData="name='DCP_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DCPType extends EObject {
	/**
	 * Returns the value of the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connect point URLs for the HTTP Distributed Computing Platform (DCP). Normally, only one Get and/or one Post is included in this element. More than one Get and/or Post is allowed to support including alternative URLs for uses such as load balancing or backup. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HTTP</em>' containment reference.
	 * @see #setHTTP(HTTPType)
	 * @see net.opengis.ows.OWSPackage#getDCPType_HTTP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HTTP' namespace='##targetNamespace'"
	 * @generated
	 */
	HTTPType getHTTP();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DCPType#getHTTP <em>HTTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTTP</em>' containment reference.
	 * @see #getHTTP()
	 * @generated
	 */
	void setHTTP(HTTPType value);

} // DCPType
