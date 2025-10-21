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

import basisnachricht.CodeVerzeichnisdienstType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behoerde Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Typ enthält Angaben zur Identifikation einer Behörde / öffentlichen Stelle in einem Verzeichnisdienst sowie ihrer Erreichbarkeit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}</li>
 *   <li>{@link de.xoev.domea.domea.BehoerdeType#getKennung <em>Kennung</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getBehoerdeType()
 * @model extendedMetaData="name='BehoerdeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BehoerdeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Verzeichnisdienst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Verzeichnisdienstes (bspw. DVDV), in welchem die Behörde / öffentliche Stelle unter der nachfolgend angegebenen Kennung eingetragen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verzeichnisdienst</em>' containment reference.
	 * @see #setVerzeichnisdienst(CodeVerzeichnisdienstType)
	 * @see de.xoev.domea.domea.DomeaPackage#getBehoerdeType_Verzeichnisdienst()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verzeichnisdienst' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVerzeichnisdienstType getVerzeichnisdienst();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verzeichnisdienst</em>' containment reference.
	 * @see #getVerzeichnisdienst()
	 * @generated
	 */
	void setVerzeichnisdienst(CodeVerzeichnisdienstType value);

	/**
	 * Returns the value of the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält die eindeutige Kennzeichnung der Behörde / öffentlichen Stelle innerhalb des angegebenen Verzeichnisdienstes. Für den Verzeichnisdienst „DVDV“ enthält die Kennzeichnung das „Präfix“ und die „Kennung“ getrennt durch das Zeichen ':', also bspw. 'psw:01003110'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennung</em>' attribute.
	 * @see #setKennung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getBehoerdeType_Kennung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='kennung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKennung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.BehoerdeType#getKennung <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennung</em>' attribute.
	 * @see #getKennung()
	 * @generated
	 */
	void setKennung(String value);

} // BehoerdeType
