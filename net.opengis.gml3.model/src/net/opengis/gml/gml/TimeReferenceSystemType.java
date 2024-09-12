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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TimeReferenceSystemType#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTimeReferenceSystemType()
 * @model extendedMetaData="name='TimeReferenceSystemType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeReferenceSystemType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Domain Of Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Of Validity</em>' attribute.
	 * @see #setDomainOfValidity(String)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeReferenceSystemType_DomainOfValidity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainOfValidity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDomainOfValidity();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeReferenceSystemType#getDomainOfValidity <em>Domain Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Of Validity</em>' attribute.
	 * @see #getDomainOfValidity()
	 * @generated
	 */
	void setDomainOfValidity(String value);

} // TimeReferenceSystemType
