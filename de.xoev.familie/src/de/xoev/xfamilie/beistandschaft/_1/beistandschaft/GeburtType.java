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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit diesem Datentyp werden die Geburtsinformationen einer Person abgebildet. Dabei ist es erlaubt, unvollständige Angaben zum Geburtstag zu machen, sofern dieser nicht vollständig bekannt ist. Regel: Das Geburtsdatum, Geburtsort und -staat müssen vollständig angegeben werden
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsortStaat <em>Geburtsort Staat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getGeburtType()
 * @model extendedMetaData="name='GeburtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeburtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element ist der Geburtsort der Person zu übermitteln.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsort</em>' attribute.
	 * @see #setGeburtsort(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getGeburtType_Geburtsort()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='geburtsort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeburtsort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsort <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsort</em>' attribute.
	 * @see #getGeburtsort()
	 * @generated
	 */
	void setGeburtsort(String value);

	/**
	 * Returns the value of the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird der Geburtsstaat der Person übermittelt.Eine Angabe in diesem Feld erfolgt nur bei nicht in der Bundesrepublik Deutschland geborenen Personen. In diesen Fällen ist das Staatsgebiet anzugeben, in dem der Einwohner geboren ist. Die Erfassung des Ersatzwertes 994 für von/nach See ist nicht zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsort Staat</em>' containment reference.
	 * @see #setGeburtsortStaat(CodeStaatType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getGeburtType_GeburtsortStaat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsortStaat' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatType getGeburtsortStaat();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsortStaat <em>Geburtsort Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsort Staat</em>' containment reference.
	 * @see #getGeburtsortStaat()
	 * @generated
	 */
	void setGeburtsortStaat(CodeStaatType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Element wird das Geburtsdatum übermittelt. Sofern das vollständige Geburtsdatum vorliegt, ist das Element jahrMonatTag zu befüllen, sofern die Tagesangabe fehlt, das Element jahrMonat, sofern die Tagesangabe und die Monatsangabe fehlen, das Element jahr und sofern alle Angaben zum Geburtsdatum fehlen, das Element unbekannt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #setGeburtsdatum(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getGeburtType_Geburtsdatum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType#getGeburtsdatum <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(TeilbekanntesDatumType value);

} // GeburtType
