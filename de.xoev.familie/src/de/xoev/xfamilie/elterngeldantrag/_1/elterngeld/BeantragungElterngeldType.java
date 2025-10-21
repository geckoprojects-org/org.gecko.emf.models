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
 * A representation of the model object '<em><b>Beantragung Elterngeld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getLeistungshoehe <em>Leistungshoehe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isBasisElterngeld <em>Basis Elterngeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumBasisElterngeld <em>Zeitraum Basis Elterngeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isElterngeldPlus <em>Elterngeld Plus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumElterngeldPlus <em>Zeitraum Elterngeld Plus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isPartnerschaftsBonusMonate <em>Partnerschafts Bonus Monate</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getZeitraumPartnerschaftsBonusMonate <em>Zeitraum Partnerschafts Bonus Monate</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType()
 * @model extendedMetaData="name='BeantragungElterngeldType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeantragungElterngeldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Leistungshoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Elterngeld aus Erwerbseinkommen berechnet werden soll, oder der Mindestbetrag gewählt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leistungshoehe</em>' containment reference.
	 * @see #setLeistungshoehe(CodeLeistungshoeheType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType_Leistungshoehe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leistungshoehe' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeLeistungshoeheType getLeistungshoehe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#getLeistungshoehe <em>Leistungshoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leistungshoehe</em>' containment reference.
	 * @see #getLeistungshoehe()
	 * @generated
	 */
	void setLeistungshoehe(CodeLeistungshoeheType value);

	/**
	 * Returns the value of the '<em><b>Basis Elterngeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Elterngeld</em>' attribute.
	 * @see #isSetBasisElterngeld()
	 * @see #unsetBasisElterngeld()
	 * @see #setBasisElterngeld(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType_BasisElterngeld()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='basisElterngeld' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBasisElterngeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isBasisElterngeld <em>Basis Elterngeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Elterngeld</em>' attribute.
	 * @see #isSetBasisElterngeld()
	 * @see #unsetBasisElterngeld()
	 * @see #isBasisElterngeld()
	 * @generated
	 */
	void setBasisElterngeld(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isBasisElterngeld <em>Basis Elterngeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBasisElterngeld()
	 * @see #isBasisElterngeld()
	 * @see #setBasisElterngeld(boolean)
	 * @generated
	 */
	void unsetBasisElterngeld();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isBasisElterngeld <em>Basis Elterngeld</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Basis Elterngeld</em>' attribute is set.
	 * @see #unsetBasisElterngeld()
	 * @see #isBasisElterngeld()
	 * @see #setBasisElterngeld(boolean)
	 * @generated
	 */
	boolean isSetBasisElterngeld();

	/**
	 * Returns the value of the '<em><b>Zeitraum Basis Elterngeld</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der beantragten Lebensmonate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Basis Elterngeld</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType_ZeitraumBasisElterngeld()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='zeitraumBasisElterngeld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getZeitraumBasisElterngeld();

	/**
	 * Returns the value of the '<em><b>Elterngeld Plus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elterngeld Plus</em>' attribute.
	 * @see #isSetElterngeldPlus()
	 * @see #unsetElterngeldPlus()
	 * @see #setElterngeldPlus(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType_ElterngeldPlus()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='elterngeldPlus' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isElterngeldPlus();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isElterngeldPlus <em>Elterngeld Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeld Plus</em>' attribute.
	 * @see #isSetElterngeldPlus()
	 * @see #unsetElterngeldPlus()
	 * @see #isElterngeldPlus()
	 * @generated
	 */
	void setElterngeldPlus(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isElterngeldPlus <em>Elterngeld Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElterngeldPlus()
	 * @see #isElterngeldPlus()
	 * @see #setElterngeldPlus(boolean)
	 * @generated
	 */
	void unsetElterngeldPlus();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isElterngeldPlus <em>Elterngeld Plus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elterngeld Plus</em>' attribute is set.
	 * @see #unsetElterngeldPlus()
	 * @see #isElterngeldPlus()
	 * @see #setElterngeldPlus(boolean)
	 * @generated
	 */
	boolean isSetElterngeldPlus();

	/**
	 * Returns the value of the '<em><b>Zeitraum Elterngeld Plus</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der beantragten Lebensmonate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Elterngeld Plus</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType_ZeitraumElterngeldPlus()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='zeitraumElterngeldPlus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getZeitraumElterngeldPlus();

	/**
	 * Returns the value of the '<em><b>Partnerschafts Bonus Monate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partnerschafts Bonus Monate</em>' attribute.
	 * @see #isSetPartnerschaftsBonusMonate()
	 * @see #unsetPartnerschaftsBonusMonate()
	 * @see #setPartnerschaftsBonusMonate(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType_PartnerschaftsBonusMonate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='partnerschaftsBonusMonate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPartnerschaftsBonusMonate();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isPartnerschaftsBonusMonate <em>Partnerschafts Bonus Monate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partnerschafts Bonus Monate</em>' attribute.
	 * @see #isSetPartnerschaftsBonusMonate()
	 * @see #unsetPartnerschaftsBonusMonate()
	 * @see #isPartnerschaftsBonusMonate()
	 * @generated
	 */
	void setPartnerschaftsBonusMonate(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isPartnerschaftsBonusMonate <em>Partnerschafts Bonus Monate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartnerschaftsBonusMonate()
	 * @see #isPartnerschaftsBonusMonate()
	 * @see #setPartnerschaftsBonusMonate(boolean)
	 * @generated
	 */
	void unsetPartnerschaftsBonusMonate();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BeantragungElterngeldType#isPartnerschaftsBonusMonate <em>Partnerschafts Bonus Monate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Partnerschafts Bonus Monate</em>' attribute is set.
	 * @see #unsetPartnerschaftsBonusMonate()
	 * @see #isPartnerschaftsBonusMonate()
	 * @see #setPartnerschaftsBonusMonate(boolean)
	 * @generated
	 */
	boolean isSetPartnerschaftsBonusMonate();

	/**
	 * Returns the value of the '<em><b>Zeitraum Partnerschafts Bonus Monate</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der beantragten Lebensmonate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum Partnerschafts Bonus Monate</em>' attribute list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBeantragungElterngeldType_ZeitraumPartnerschaftsBonusMonate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="4"
	 *        extendedMetaData="kind='element' name='zeitraumPartnerschaftsBonusMonate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getZeitraumPartnerschaftsBonusMonate();

} // BeantragungElterngeldType
