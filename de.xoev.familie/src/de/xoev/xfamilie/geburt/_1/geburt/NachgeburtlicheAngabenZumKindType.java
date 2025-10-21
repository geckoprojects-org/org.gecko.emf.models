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
package de.xoev.xfamilie.geburt._1.geburt;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZRegionalschluesselType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachgeburtliche Angaben Zum Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit diesem Datentyp werden die Geburtsinformationen des Kindes abgebildet. Dabei ist es erlaubt, unvollständige Angaben zum Geburtstag zu machen, sofern dieser nicht vollständig bekannt ist. Regel: Das Geburtsdatum, Geburtsort und -staat müssen vollständig angegeben werden
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getNameDesKindes <em>Name Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsortStaat <em>Geburtsort Staat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsregisterNummer <em>Geburtsregister Nummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsstandesamt <em>Geburtsstandesamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getRegisterfuehrendeStelleARS <em>Registerfuehrende Stelle ARS</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType()
 * @model extendedMetaData="name='NachgeburtlicheAngabenZumKindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachgeburtlicheAngabenZumKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Des Kindes</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Vornamen, Nachnamen und Geburtsnamen des Kindes. Für die Nachricht 0801 sind Vorname und Familienname zu Identifikationszwecken verpflichtend auszufüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Des Kindes</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType_NameDesKindes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nameDesKindes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameNatuerlichePersonType> getNameDesKindes();

	/**
	 * Returns the value of the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geburtsort des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsort</em>' attribute.
	 * @see #setGeburtsort(String)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType_Geburtsort()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='geburtsort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeburtsort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsort <em>Geburtsort</em>}' attribute.
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
	 * Mit diesem Element wird der Geburtsstaat des Kindes übermittelt.Eine Angabe in diesem Feld erfolgt nur bei nicht in der Bundesrepublik Deutschland geborenen Personen. In diesen Fällen ist das Staatsgebiet anzugeben, in dem der Einwohner geboren ist. Die Erfassung des Ersatzwertes 994 für von/nach See ist nicht zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsort Staat</em>' containment reference.
	 * @see #setGeburtsortStaat(CodeStaatType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType_GeburtsortStaat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsortStaat' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatType getGeburtsortStaat();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsortStaat <em>Geburtsort Staat</em>}' containment reference.
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
	 * Mit diesem Element wird das Geburtsdatum übermittelt. Sofern das vollständige Geburtsdatum vorliegt, ist das Element jahrMonatTag zu befüllen, sofern die Tagesangabe fehlt, das Element jahrMonat, sofern die Tagesangabe und die Monatsangabe fehlen, das Element jahr.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #setGeburtsdatum(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType_Geburtsdatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsdatum <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Geburtsregister Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geburtsregisternummer des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsregister Nummer</em>' attribute.
	 * @see #setGeburtsregisterNummer(String)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType_GeburtsregisterNummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='geburtsregisterNummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeburtsregisterNummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsregisterNummer <em>Geburtsregister Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsregister Nummer</em>' attribute.
	 * @see #getGeburtsregisterNummer()
	 * @generated
	 */
	void setGeburtsregisterNummer(String value);

	/**
	 * Returns the value of the '<em><b>Geburtsstandesamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geburtsstandesamt des Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsstandesamt</em>' attribute.
	 * @see #setGeburtsstandesamt(String)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType_Geburtsstandesamt()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='geburtsstandesamt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeburtsstandesamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getGeburtsstandesamt <em>Geburtsstandesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsstandesamt</em>' attribute.
	 * @see #getGeburtsstandesamt()
	 * @generated
	 */
	void setGeburtsstandesamt(String value);

	/**
	 * Returns the value of the '<em><b>Registerfuehrende Stelle ARS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Datenfeld kann der ARS des Geburtsjugendamtes des Kindes übertragen werden. Für die Ausstellung einer Auskunft über die Alleinsorge aus dem Sorgeregister nach § 58 SGB VIII ist die Angabe des ARS des Geburtsorts vom Kind erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registerfuehrende Stelle ARS</em>' containment reference.
	 * @see #setRegisterfuehrendeStelleARS(CodeGemeindeVZRegionalschluesselType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getNachgeburtlicheAngabenZumKindType_RegisterfuehrendeStelleARS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='registerfuehrendeStelleARS' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGemeindeVZRegionalschluesselType getRegisterfuehrendeStelleARS();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.NachgeburtlicheAngabenZumKindType#getRegisterfuehrendeStelleARS <em>Registerfuehrende Stelle ARS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registerfuehrende Stelle ARS</em>' containment reference.
	 * @see #getRegisterfuehrendeStelleARS()
	 * @generated
	 */
	void setRegisterfuehrendeStelleARS(CodeGemeindeVZRegionalschluesselType value);

} // NachgeburtlicheAngabenZumKindType
