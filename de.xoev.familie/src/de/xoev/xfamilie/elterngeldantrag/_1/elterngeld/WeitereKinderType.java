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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weitere Kinder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType#getAnzahlAllerImHaushaltLebendenKinder <em>Anzahl Aller Im Haushalt Lebenden Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType#getAngabenWeiteresKind <em>Angaben Weiteres Kind</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getWeitereKinderType()
 * @model extendedMetaData="name='WeitereKinderType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WeitereKinderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anzahl Aller Im Haushalt Lebenden Kinder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anzahl Aller Im Haushalt Lebenden Kinder</em>' attribute.
	 * @see #setAnzahlAllerImHaushaltLebendenKinder(BigInteger)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getWeitereKinderType_AnzahlAllerImHaushaltLebendenKinder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='anzahlAllerImHaushaltLebendenKinder' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAnzahlAllerImHaushaltLebendenKinder();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType#getAnzahlAllerImHaushaltLebendenKinder <em>Anzahl Aller Im Haushalt Lebenden Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Aller Im Haushalt Lebenden Kinder</em>' attribute.
	 * @see #getAnzahlAllerImHaushaltLebendenKinder()
	 * @generated
	 */
	void setAnzahlAllerImHaushaltLebendenKinder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Angaben Weiteres Kind</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Weiteres Kind</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getWeitereKinderType_AngabenWeiteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenWeiteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngabenWeiteresKindType> getAngabenWeiteresKind();

} // WeitereKinderType
