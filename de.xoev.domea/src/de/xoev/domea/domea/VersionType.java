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
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine Version ist ein definierter Stand eines Dokuments bzw. eines Schriftstücks zu einem bestimmten Zeitpunkt. Verschiedene Versionen stellen die Veränderung und Weiterentwicklung eines Dokumentes bzw. eines Schriftstücks dar. Welche Veränderungen zu einer neuen Version führen, ist eine organisatorische Festlegung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.VersionType#getNummer <em>Nummer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.VersionType#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getVersionType()
 * @model extendedMetaData="name='VersionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VersionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Nummer der Version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nummer</em>' attribute.
	 * @see #setNummer(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getVersionType_Nummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Nummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNummer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.VersionType#getNummer <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer</em>' attribute.
	 * @see #getNummer()
	 * @generated
	 */
	void setNummer(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.FormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Format, das der Dokumentversion zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getVersionType_Format()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Format' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FormatType> getFormat();

} // VersionType
