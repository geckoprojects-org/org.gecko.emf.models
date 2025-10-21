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
package de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kommunikation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Typ enthält Angaben zur Erreichbarkeit über elektronische Kommunikationskanäle (z. B. Telefon, E-Mail).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKanal <em>Kanal</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getZusatz <em>Zusatz</em>}</li>
 * </ul>
 *
 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getKommunikationType()
 * @model extendedMetaData="name='KommunikationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KommunikationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der 'kanal' gibt an, über welchen Kommunikationskanal eine Erreichbarkeit besteht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kanal</em>' containment reference.
	 * @see #setKanal(CodeKommunikationKanalType)
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getKommunikationType_Kanal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kanal'"
	 * @generated
	 */
	CodeKommunikationKanalType getKanal();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKanal <em>Kanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kanal</em>' containment reference.
	 * @see #getKanal()
	 * @generated
	 */
	void setKanal(CodeKommunikationKanalType value);

	/**
	 * Returns the value of the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kennung beinhaltet die konkreten Angaben zur Erreichbarkeit über einen Kommunikationskanal, d. h. die Telefonnummer, E-Mail-Adresse oder dergleichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennung</em>' attribute.
	 * @see #setKennung(String)
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getKommunikationType_Kennung()
	 * @model dataType="de.xoev.kosit.datentyp._201903.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='kennung'"
	 * @generated
	 */
	String getKennung();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getKennung <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennung</em>' attribute.
	 * @see #getKennung()
	 * @generated
	 */
	void setKennung(String value);

	/**
	 * Returns the value of the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine zusätzliche Bemerkung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatz</em>' attribute.
	 * @see #setZusatz(String)
	 * @see de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.BasisnachrichtUnqualifiedPackage#getKommunikationType_Zusatz()
	 * @model dataType="de.xoev.kosit.datentyp._201903.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zusatz'"
	 * @generated
	 */
	String getZusatz();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.unqualified.g2g.basisnachricht.KommunikationType#getZusatz <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatz</em>' attribute.
	 * @see #getZusatz()
	 * @generated
	 */
	void setZusatz(String value);

} // KommunikationType
