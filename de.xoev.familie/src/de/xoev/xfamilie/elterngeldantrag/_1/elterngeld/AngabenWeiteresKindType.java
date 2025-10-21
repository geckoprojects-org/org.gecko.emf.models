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
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Weiteres Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getNameWeiteresKind <em>Name Weiteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getGeburtsdatumNachweis <em>Geburtsdatum Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getHaushaltsaufnahme <em>Haushaltsaufnahme</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getHaushaltsaufnahmeNachweis <em>Haushaltsaufnahme Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#isBehinderungsgrad <em>Behinderungsgrad</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getBehinderungsgradNachweis <em>Behinderungsgrad Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET1 <em>Verhaeltnis ET1</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET2 <em>Verhaeltnis ET2</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType()
 * @model extendedMetaData="name='AngabenWeiteresKindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenWeiteresKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Weiteres Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name eines weiteren im Haushalt lebenden Kindes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Weiteres Kind</em>' containment reference.
	 * @see #setNameWeiteresKind(NameNatuerlichePersonNachweisbezugType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_NameWeiteresKind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameWeiteresKind' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonNachweisbezugType getNameWeiteresKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getNameWeiteresKind <em>Name Weiteres Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Weiteres Kind</em>' containment reference.
	 * @see #getNameWeiteresKind()
	 * @generated
	 */
	void setNameWeiteresKind(NameNatuerlichePersonNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #setGeburtsdatum(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_Geburtsdatum()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getGeburtsdatum <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' attribute.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_GeburtsdatumNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburtsdatumNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getGeburtsdatumNachweis();

	/**
	 * Returns the value of the '<em><b>Haushaltsaufnahme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haushaltsaufnahme</em>' attribute.
	 * @see #setHaushaltsaufnahme(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_Haushaltsaufnahme()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='haushaltsaufnahme' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getHaushaltsaufnahme();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getHaushaltsaufnahme <em>Haushaltsaufnahme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haushaltsaufnahme</em>' attribute.
	 * @see #getHaushaltsaufnahme()
	 * @generated
	 */
	void setHaushaltsaufnahme(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Haushaltsaufnahme Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haushaltsaufnahme Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_HaushaltsaufnahmeNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='haushaltsaufnahmeNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getHaushaltsaufnahmeNachweis();

	/**
	 * Returns the value of the '<em><b>Behinderungsgrad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True: Der Behinderungsgrad des weiteren Kindes liegt über oder ist gleich 20. False: Der Behinderungsgrad des weiteren Kindes liegt unter 20.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behinderungsgrad</em>' attribute.
	 * @see #isSetBehinderungsgrad()
	 * @see #unsetBehinderungsgrad()
	 * @see #setBehinderungsgrad(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_Behinderungsgrad()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='behinderungsgrad' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBehinderungsgrad();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#isBehinderungsgrad <em>Behinderungsgrad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behinderungsgrad</em>' attribute.
	 * @see #isSetBehinderungsgrad()
	 * @see #unsetBehinderungsgrad()
	 * @see #isBehinderungsgrad()
	 * @generated
	 */
	void setBehinderungsgrad(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#isBehinderungsgrad <em>Behinderungsgrad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBehinderungsgrad()
	 * @see #isBehinderungsgrad()
	 * @see #setBehinderungsgrad(boolean)
	 * @generated
	 */
	void unsetBehinderungsgrad();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#isBehinderungsgrad <em>Behinderungsgrad</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Behinderungsgrad</em>' attribute is set.
	 * @see #unsetBehinderungsgrad()
	 * @see #isBehinderungsgrad()
	 * @see #setBehinderungsgrad(boolean)
	 * @generated
	 */
	boolean isSetBehinderungsgrad();

	/**
	 * Returns the value of the '<em><b>Behinderungsgrad Nachweis</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behinderungsgrad Nachweis</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_BehinderungsgradNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='behinderungsgradNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getBehinderungsgradNachweis();

	/**
	 * Returns the value of the '<em><b>Verhaeltnis ET1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verhaeltnis ET1</em>' containment reference.
	 * @see #setVerhaeltnisET1(CodeKindschaftsverhaeltnisType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_VerhaeltnisET1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='verhaeltnisET1' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKindschaftsverhaeltnisType getVerhaeltnisET1();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET1 <em>Verhaeltnis ET1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verhaeltnis ET1</em>' containment reference.
	 * @see #getVerhaeltnisET1()
	 * @generated
	 */
	void setVerhaeltnisET1(CodeKindschaftsverhaeltnisType value);

	/**
	 * Returns the value of the '<em><b>Verhaeltnis ET2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verhaeltnis ET2</em>' containment reference.
	 * @see #setVerhaeltnisET2(CodeKindschaftsverhaeltnisType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenWeiteresKindType_VerhaeltnisET2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verhaeltnisET2' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKindschaftsverhaeltnisType getVerhaeltnisET2();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenWeiteresKindType#getVerhaeltnisET2 <em>Verhaeltnis ET2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verhaeltnis ET2</em>' containment reference.
	 * @see #getVerhaeltnisET2()
	 * @generated
	 */
	void setVerhaeltnisET2(CodeKindschaftsverhaeltnisType value);

} // AngabenWeiteresKindType
