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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Besonders Frueh Geborenes Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#isBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#getErrechneterGeburtstermin <em>Errechneter Geburtstermin</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#getNachweisBesondersFruehGeboren <em>Nachweis Besonders Frueh Geboren</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBesondersFruehGeborenesKindType()
 * @model extendedMetaData="name='besondersFruehGeborenesKind_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BesondersFruehGeborenesKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Besonders Frueh Geborenes Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob es sich um ein besonders früh geborenes Kind handelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Besonders Frueh Geborenes Kind</em>' attribute.
	 * @see #isSetBesondersFruehGeborenesKind()
	 * @see #unsetBesondersFruehGeborenesKind()
	 * @see #setBesondersFruehGeborenesKind(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBesondersFruehGeborenesKindType_BesondersFruehGeborenesKind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='besondersFruehGeborenesKind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBesondersFruehGeborenesKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#isBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besonders Frueh Geborenes Kind</em>' attribute.
	 * @see #isSetBesondersFruehGeborenesKind()
	 * @see #unsetBesondersFruehGeborenesKind()
	 * @see #isBesondersFruehGeborenesKind()
	 * @generated
	 */
	void setBesondersFruehGeborenesKind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#isBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBesondersFruehGeborenesKind()
	 * @see #isBesondersFruehGeborenesKind()
	 * @see #setBesondersFruehGeborenesKind(boolean)
	 * @generated
	 */
	void unsetBesondersFruehGeborenesKind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#isBesondersFruehGeborenesKind <em>Besonders Frueh Geborenes Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Besonders Frueh Geborenes Kind</em>' attribute is set.
	 * @see #unsetBesondersFruehGeborenesKind()
	 * @see #isBesondersFruehGeborenesKind()
	 * @see #setBesondersFruehGeborenesKind(boolean)
	 * @generated
	 */
	boolean isSetBesondersFruehGeborenesKind();

	/**
	 * Returns the value of the '<em><b>Errechneter Geburtstermin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum durch medizinisches Fachpersonal errechneten Geburtstermin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Errechneter Geburtstermin</em>' attribute.
	 * @see #setErrechneterGeburtstermin(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBesondersFruehGeborenesKindType_ErrechneterGeburtstermin()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='errechneterGeburtstermin' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getErrechneterGeburtstermin();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BesondersFruehGeborenesKindType#getErrechneterGeburtstermin <em>Errechneter Geburtstermin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errechneter Geburtstermin</em>' attribute.
	 * @see #getErrechneterGeburtstermin()
	 * @generated
	 */
	void setErrechneterGeburtstermin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nachweis Besonders Frueh Geboren</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Besonders Frueh Geboren</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getBesondersFruehGeborenesKindType_NachweisBesondersFruehGeboren()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisBesondersFruehGeboren' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisBesondersFruehGeboren();

} // BesondersFruehGeborenesKindType
