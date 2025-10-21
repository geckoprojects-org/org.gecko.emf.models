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

import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Zum Elternteil1 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Vater des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getNameElternteil1 <em>Name Elternteil1</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#isDolmetscherBenoetigt <em>Dolmetscher Benoetigt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftAusland <em>Anschrift Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getKontakt <em>Kontakt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftPostalisch <em>Anschrift Postalisch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type()
 * @model extendedMetaData="name='AngabenZumElternteil1Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenZumElternteil1Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Elternteil1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Vornamen, Nachnamen und Geburtsnamen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Elternteil1</em>' containment reference.
	 * @see #setNameElternteil1(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_NameElternteil1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameElternteil1' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNameElternteil1();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getNameElternteil1 <em>Name Elternteil1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Elternteil1</em>' containment reference.
	 * @see #getNameElternteil1()
	 * @generated
	 */
	void setNameElternteil1(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Geburt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_Geburt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Staatsangehörigkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_Staatsangehoerigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeStaatsangehoerigkeitType> getStaatsangehoerigkeit();

	/**
	 * Returns the value of the '<em><b>Dolmetscher Benoetigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob ein Dolmentscher benötigt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dolmetscher Benoetigt</em>' attribute.
	 * @see #isSetDolmetscherBenoetigt()
	 * @see #unsetDolmetscherBenoetigt()
	 * @see #setDolmetscherBenoetigt(boolean)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_DolmetscherBenoetigt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='dolmetscherBenoetigt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDolmetscherBenoetigt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#isDolmetscherBenoetigt <em>Dolmetscher Benoetigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dolmetscher Benoetigt</em>' attribute.
	 * @see #isSetDolmetscherBenoetigt()
	 * @see #unsetDolmetscherBenoetigt()
	 * @see #isDolmetscherBenoetigt()
	 * @generated
	 */
	void setDolmetscherBenoetigt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#isDolmetscherBenoetigt <em>Dolmetscher Benoetigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDolmetscherBenoetigt()
	 * @see #isDolmetscherBenoetigt()
	 * @see #setDolmetscherBenoetigt(boolean)
	 * @generated
	 */
	void unsetDolmetscherBenoetigt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#isDolmetscherBenoetigt <em>Dolmetscher Benoetigt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dolmetscher Benoetigt</em>' attribute is set.
	 * @see #unsetDolmetscherBenoetigt()
	 * @see #isDolmetscherBenoetigt()
	 * @see #setDolmetscherBenoetigt(boolean)
	 * @generated
	 */
	boolean isSetDolmetscherBenoetigt();

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Meldeanschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_Anschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeldeanschriftType> getAnschrift();

	/**
	 * Returns the value of the '<em><b>Anschrift Ausland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe einer ausländischen Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Ausland</em>' containment reference.
	 * @see #setAnschriftAusland(AuslandsanschriftType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_AnschriftAusland()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftAusland' namespace='##targetNamespace'"
	 * @generated
	 */
	AuslandsanschriftType getAnschriftAusland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftAusland <em>Anschrift Ausland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Ausland</em>' containment reference.
	 * @see #getAnschriftAusland()
	 * @generated
	 */
	void setAnschriftAusland(AuslandsanschriftType value);

	/**
	 * Returns the value of the '<em><b>Kontakt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontakt</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_Kontakt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kontakt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getKontakt();

	/**
	 * Returns the value of the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Familienstand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienstand</em>' containment reference.
	 * @see #setFamilienstand(CodeFamilienstandType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_Familienstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='familienstand' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeFamilienstandType getFamilienstand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getFamilienstand <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienstand</em>' containment reference.
	 * @see #getFamilienstand()
	 * @generated
	 */
	void setFamilienstand(CodeFamilienstandType value);

	/**
	 * Returns the value of the '<em><b>Anschrift Postalisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aktueller Wohnsitz/ Postanschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Postalisch</em>' containment reference.
	 * @see #setAnschriftPostalisch(PostalischeInlandsanschriftType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenZumElternteil1Type_AnschriftPostalisch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftPostalisch' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftType getAnschriftPostalisch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type#getAnschriftPostalisch <em>Anschrift Postalisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Postalisch</em>' containment reference.
	 * @see #getAnschriftPostalisch()
	 * @generated
	 */
	void setAnschriftPostalisch(PostalischeInlandsanschriftType value);

} // AngabenZumElternteil1Type
