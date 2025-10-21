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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Familienname Unstrukturiert Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit diesem Datentyp werden die vollständigen Informationen zum Familiennamen in unstrukturierter Form abgebildet. Der Familienname wird in der Regel im mandatorischen Kindelement nachname übermittelt. Das Kindelement nachnamepass ist für folgenden Kontext vorgesehen: Für die Schreibweise des Namens von Ausländern ist die Eintragung im Pass maßgebend. Führt ein Ausländer nach deutschem Recht einen anderen als den im ausländischen Pass angegebenen Familiennamen und kann eine Änderung des Passes aus rechtlichen oder tatsächlichen Gründen nicht vorgenommen werden, so wird der nach deutschem Recht zu führende Familienname im Element nachname, der im Pass eingetragene Familienname in im Element "nachnamepass" angegeben (vgl. DSMeld-Blätter 0101 und 0101a).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachnamepass <em>Nachnamepass</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFamiliennameUnstrukturiertType()
 * @model extendedMetaData="name='FamiliennameUnstrukturiertType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FamiliennameUnstrukturiertType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird die gewöhnliche Schreibweise des Nachnamens in unstrukturierter Form übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachname</em>' containment reference.
	 * @see #setNachname(AllgemeinerNameType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFamiliennameUnstrukturiertType_Nachname()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachname' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinerNameType getNachname();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachname <em>Nachname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachname</em>' containment reference.
	 * @see #getNachname()
	 * @generated
	 */
	void setNachname(AllgemeinerNameType value);

	/**
	 * Returns the value of the '<em><b>Nachnamepass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird ein vom Namen nach deutschem Recht abweichender Nachname im ausländischen Pass übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachnamepass</em>' containment reference.
	 * @see #setNachnamepass(AllgemeinerNameType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFamiliennameUnstrukturiertType_Nachnamepass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachnamepass' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinerNameType getNachnamepass();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachnamepass <em>Nachnamepass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachnamepass</em>' containment reference.
	 * @see #getNachnamepass()
	 * @generated
	 */
	void setNachnamepass(AllgemeinerNameType value);

} // FamiliennameUnstrukturiertType
