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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aufenthalt Kind Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Aufenthalt des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#isAufenthaltsortGeheimHalten <em>Aufenthaltsort Geheim Halten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAuslandsschuljahr <em>Auslandsschuljahr</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getSeitWann <em>Seit Wann</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAufenthaltHeim <em>Aufenthalt Heim</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAufenthaltKindBasisType()
 * @model extendedMetaData="name='Aufenthalt.Kind.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AufenthaltKindBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, wo und wie das Kind sich aufhält. Regel: Aus der Codeliste sind folgende Literale für Unterhaltsvorschuss zulässig "03", "04", "05", "06", "07", "08", "09" und "010".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeKindWohnhaftBeiType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAufenthaltKindBasisType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKindWohnhaftBeiType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeKindWohnhaftBeiType value);

	/**
	 * Returns the value of the '<em><b>Aufenthaltsort Geheim Halten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob der Aufenthaltsort geheimgehalten werden muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltsort Geheim Halten</em>' attribute.
	 * @see #isSetAufenthaltsortGeheimHalten()
	 * @see #unsetAufenthaltsortGeheimHalten()
	 * @see #setAufenthaltsortGeheimHalten(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAufenthaltKindBasisType_AufenthaltsortGeheimHalten()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='aufenthaltsortGeheimHalten' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAufenthaltsortGeheimHalten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#isAufenthaltsortGeheimHalten <em>Aufenthaltsort Geheim Halten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthaltsort Geheim Halten</em>' attribute.
	 * @see #isSetAufenthaltsortGeheimHalten()
	 * @see #unsetAufenthaltsortGeheimHalten()
	 * @see #isAufenthaltsortGeheimHalten()
	 * @generated
	 */
	void setAufenthaltsortGeheimHalten(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#isAufenthaltsortGeheimHalten <em>Aufenthaltsort Geheim Halten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAufenthaltsortGeheimHalten()
	 * @see #isAufenthaltsortGeheimHalten()
	 * @see #setAufenthaltsortGeheimHalten(boolean)
	 * @generated
	 */
	void unsetAufenthaltsortGeheimHalten();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#isAufenthaltsortGeheimHalten <em>Aufenthaltsort Geheim Halten</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aufenthaltsort Geheim Halten</em>' attribute is set.
	 * @see #unsetAufenthaltsortGeheimHalten()
	 * @see #isAufenthaltsortGeheimHalten()
	 * @see #setAufenthaltsortGeheimHalten(boolean)
	 * @generated
	 */
	boolean isSetAufenthaltsortGeheimHalten();

	/**
	 * Returns the value of the '<em><b>Auslandsschuljahr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Auslandsschuljahr. Regel: Falls "Auslandsschuljahr" bei "art" übertragen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auslandsschuljahr</em>' containment reference.
	 * @see #setAuslandsschuljahr(ZeitraumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAufenthaltKindBasisType_Auslandsschuljahr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auslandsschuljahr' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getAuslandsschuljahr();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAuslandsschuljahr <em>Auslandsschuljahr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auslandsschuljahr</em>' containment reference.
	 * @see #getAuslandsschuljahr()
	 * @generated
	 */
	void setAuslandsschuljahr(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Seit Wann</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ab dem die Aufenthaltsart gilt. Regel: verpflichtend anzugeben, falls eines der folgenden Literale für die Art des Aufenthalts ausgewählt wurde: "03", "04", "09" und "010" .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seit Wann</em>' attribute.
	 * @see #setSeitWann(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAufenthaltKindBasisType_SeitWann()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='seitWann' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSeitWann();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getSeitWann <em>Seit Wann</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seit Wann</em>' attribute.
	 * @see #getSeitWann()
	 * @generated
	 */
	void setSeitWann(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Aufenthalt Heim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seit wann lebt ihr Kind in einem Heim oder einer Pflegestelle?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthalt Heim</em>' attribute.
	 * @see #setAufenthaltHeim(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAufenthaltKindBasisType_AufenthaltHeim()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aufenthaltHeim' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAufenthaltHeim();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AufenthaltKindBasisType#getAufenthaltHeim <em>Aufenthalt Heim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthalt Heim</em>' attribute.
	 * @see #getAufenthaltHeim()
	 * @generated
	 */
	void setAufenthaltHeim(String value);

} // AufenthaltKindBasisType
