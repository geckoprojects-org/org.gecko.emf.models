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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lebenspartnerschaft Aufgehoben Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten für zusätzliche Daten zur Lebenspartnerschaft. Regel: Falls der Familienstand des Antragstellenden Elternteils "Lebenspartnerschaft aufgehoben" ist
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAufgehobenAntragstellendeBasisType()
 * @model extendedMetaData="name='LebenspartnerschaftAufgehoben.Antragstellende.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LebenspartnerschaftAufgehobenAntragstellendeBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden; Möglicher Nachweis ist z.B. eine gerichtliche Entscheidung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAufgehobenAntragstellendeBasisType_Nachweis()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNachweis();

	/**
	 * Returns the value of the '<em><b>Seit Wann</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitpunkt der Aufhebung der Lebenspartnerschaft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seit Wann</em>' containment reference.
	 * @see #setSeitWann(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAufgehobenAntragstellendeBasisType_SeitWann()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seitWann' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getSeitWann();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getSeitWann <em>Seit Wann</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seit Wann</em>' containment reference.
	 * @see #getSeitWann()
	 * @generated
	 */
	void setSeitWann(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu einer geplanten Hochzeit in den nächsten 12 Monaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hochzeit Geplant</em>' attribute.
	 * @see #isSetHochzeitGeplant()
	 * @see #unsetHochzeitGeplant()
	 * @see #setHochzeitGeplant(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAufgehobenAntragstellendeBasisType_HochzeitGeplant()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='hochzeitGeplant' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHochzeitGeplant();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hochzeit Geplant</em>' attribute.
	 * @see #isSetHochzeitGeplant()
	 * @see #unsetHochzeitGeplant()
	 * @see #isHochzeitGeplant()
	 * @generated
	 */
	void setHochzeitGeplant(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHochzeitGeplant()
	 * @see #isHochzeitGeplant()
	 * @see #setHochzeitGeplant(boolean)
	 * @generated
	 */
	void unsetHochzeitGeplant();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hochzeit Geplant</em>' attribute is set.
	 * @see #unsetHochzeitGeplant()
	 * @see #isHochzeitGeplant()
	 * @see #setHochzeitGeplant(boolean)
	 * @generated
	 */
	boolean isSetHochzeitGeplant();

	/**
	 * Returns the value of the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Voraussichtliches Datum zu einer geplanten Hochzeit. Regel: Nur wenn "hochzeitGeplant" True ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hochzeitsdatum Voraussichtlich</em>' attribute.
	 * @see #setHochzeitsdatumVoraussichtlich(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLebenspartnerschaftAufgehobenAntragstellendeBasisType_HochzeitsdatumVoraussichtlich()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='hochzeitsdatumVoraussichtlich' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getHochzeitsdatumVoraussichtlich();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAufgehobenAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hochzeitsdatum Voraussichtlich</em>' attribute.
	 * @see #getHochzeitsdatumVoraussichtlich()
	 * @generated
	 */
	void setHochzeitsdatumVoraussichtlich(XMLGregorianCalendar value);

} // LebenspartnerschaftAufgehobenAntragstellendeBasisType
