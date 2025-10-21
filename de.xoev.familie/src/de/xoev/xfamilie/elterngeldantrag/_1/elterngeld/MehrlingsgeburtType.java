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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mehrlingsgeburt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#isMehrlingsgeburt <em>Mehrlingsgeburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getAnzahlMehrlinge <em>Anzahl Mehrlinge</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getVornamenMehrlingskind <em>Vornamen Mehrlingskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getNachweisMehrlingsgeburt <em>Nachweis Mehrlingsgeburt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMehrlingsgeburtType()
 * @model extendedMetaData="name='MehrlingsgeburtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MehrlingsgeburtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mehrlingsgeburt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob es sich um eine Mehrlingsgeburt handelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mehrlingsgeburt</em>' attribute.
	 * @see #isSetMehrlingsgeburt()
	 * @see #unsetMehrlingsgeburt()
	 * @see #setMehrlingsgeburt(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMehrlingsgeburtType_Mehrlingsgeburt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='mehrlingsgeburt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMehrlingsgeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#isMehrlingsgeburt <em>Mehrlingsgeburt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mehrlingsgeburt</em>' attribute.
	 * @see #isSetMehrlingsgeburt()
	 * @see #unsetMehrlingsgeburt()
	 * @see #isMehrlingsgeburt()
	 * @generated
	 */
	void setMehrlingsgeburt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#isMehrlingsgeburt <em>Mehrlingsgeburt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMehrlingsgeburt()
	 * @see #isMehrlingsgeburt()
	 * @see #setMehrlingsgeburt(boolean)
	 * @generated
	 */
	void unsetMehrlingsgeburt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#isMehrlingsgeburt <em>Mehrlingsgeburt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mehrlingsgeburt</em>' attribute is set.
	 * @see #unsetMehrlingsgeburt()
	 * @see #isMehrlingsgeburt()
	 * @see #setMehrlingsgeburt(boolean)
	 * @generated
	 */
	boolean isSetMehrlingsgeburt();

	/**
	 * Returns the value of the '<em><b>Anzahl Mehrlinge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Anzahl der Mehrlinge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anzahl Mehrlinge</em>' attribute.
	 * @see #setAnzahlMehrlinge(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMehrlingsgeburtType_AnzahlMehrlinge()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='anzahlMehrlinge' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAnzahlMehrlinge();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType#getAnzahlMehrlinge <em>Anzahl Mehrlinge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Mehrlinge</em>' attribute.
	 * @see #getAnzahlMehrlinge()
	 * @generated
	 */
	void setAnzahlMehrlinge(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Vornamen Mehrlingskind</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vornamen des Mehrlingskindes. Hierzu sind für jedes Mehrlingskind die Vornamen anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vornamen Mehrlingskind</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMehrlingsgeburtType_VornamenMehrlingskind()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='vornamenMehrlingskind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getVornamenMehrlingskind();

	/**
	 * Returns the value of the '<em><b>Nachweis Mehrlingsgeburt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Mehrlingsgeburt</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getMehrlingsgeburtType_NachweisMehrlingsgeburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisMehrlingsgeburt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisMehrlingsgeburt();

} // MehrlingsgeburtType
