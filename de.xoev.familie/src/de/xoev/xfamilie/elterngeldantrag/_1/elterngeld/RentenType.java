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
 * A representation of the model object '<em><b>Renten Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#isBezugRente <em>Bezug Rente</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getZeitraumRente <em>Zeitraum Rente</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getNachweisRente <em>Nachweis Rente</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#getArtRente <em>Art Rente</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getRentenType()
 * @model extendedMetaData="name='RentenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RentenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Rente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezug Rente</em>' attribute.
	 * @see #isSetBezugRente()
	 * @see #unsetBezugRente()
	 * @see #setBezugRente(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getRentenType_BezugRente()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugRente' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugRente();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#isBezugRente <em>Bezug Rente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Rente</em>' attribute.
	 * @see #isSetBezugRente()
	 * @see #unsetBezugRente()
	 * @see #isBezugRente()
	 * @generated
	 */
	void setBezugRente(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#isBezugRente <em>Bezug Rente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugRente()
	 * @see #isBezugRente()
	 * @see #setBezugRente(boolean)
	 * @generated
	 */
	void unsetBezugRente();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType#isBezugRente <em>Bezug Rente</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Rente</em>' attribute is set.
	 * @see #unsetBezugRente()
	 * @see #isBezugRente()
	 * @see #setBezugRente(boolean)
	 * @generated
	 */
	boolean isSetBezugRente();

	/**
	 * Returns the value of the '<em><b>Zeitraum Rente</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeitraum Rente</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getRentenType_ZeitraumRente()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraumRente' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraumRente();

	/**
	 * Returns the value of the '<em><b>Nachweis Rente</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Rente</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getRentenType_NachweisRente()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisRente' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisRente();

	/**
	 * Returns the value of the '<em><b>Art Rente</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art Rente</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getRentenType_ArtRente()
	 * @model unique="false" dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='artRente' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getArtRente();

} // RentenType
