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
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Andere Leistungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hiermit kann beispielsweise auch Insolvenz-, Kurzarbeitergeld oder Gründungszuschuss abgebildet werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#isBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getZeitraumAndereLeistungen <em>Zeitraum Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getNachweisAndereLeistungen <em>Nachweis Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#getArtAndereLeistungen <em>Art Andere Leistungen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAndereLeistungenType()
 * @model extendedMetaData="name='AndereLeistungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AndereLeistungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Andere Leistungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Andere Leistungen</em>' attribute.
	 * @see #isSetBezugAndereLeistungen()
	 * @see #unsetBezugAndereLeistungen()
	 * @see #setBezugAndereLeistungen(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAndereLeistungenType_BezugAndereLeistungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugAndereLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugAndereLeistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#isBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Andere Leistungen</em>' attribute.
	 * @see #isSetBezugAndereLeistungen()
	 * @see #unsetBezugAndereLeistungen()
	 * @see #isBezugAndereLeistungen()
	 * @generated
	 */
	void setBezugAndereLeistungen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#isBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugAndereLeistungen()
	 * @see #isBezugAndereLeistungen()
	 * @see #setBezugAndereLeistungen(boolean)
	 * @generated
	 */
	void unsetBezugAndereLeistungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType#isBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Andere Leistungen</em>' attribute is set.
	 * @see #unsetBezugAndereLeistungen()
	 * @see #isBezugAndereLeistungen()
	 * @see #setBezugAndereLeistungen(boolean)
	 * @generated
	 */
	boolean isSetBezugAndereLeistungen();

	/**
	 * Returns the value of the '<em><b>Zeitraum Andere Leistungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum Andere Leistungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAndereLeistungenType_ZeitraumAndereLeistungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumAndereLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraumAndereLeistungen();

	/**
	 * Returns the value of the '<em><b>Nachweis Andere Leistungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Andere Leistungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAndereLeistungenType_NachweisAndereLeistungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisAndereLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisAndereLeistungen();

	/**
	 * Returns the value of the '<em><b>Art Andere Leistungen</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art Andere Leistungen</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAndereLeistungenType_ArtAndereLeistungen()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='artAndereLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getArtAndereLeistungen();

} // AndereLeistungenType
