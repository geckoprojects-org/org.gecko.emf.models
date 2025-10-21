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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abgebender Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum abgebenden Elternteil
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteil <em>Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getEinstellungAdoptionsabsicht <em>Einstellung Adoptionsabsicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteilVerstorben <em>Elternteil Verstorben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType()
 * @model extendedMetaData="name='AbgebenderElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbgebenderElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verhältnis vom Kind zum Elternteil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elternteil</em>' containment reference.
	 * @see #setElternteil(CodeKindschaftsbeziehungType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType_Elternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKindschaftsbeziehungType getElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteil <em>Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elternteil</em>' containment reference.
	 * @see #getElternteil()
	 * @generated
	 */
	void setElternteil(CodeKindschaftsbeziehungType value);

	/**
	 * Returns the value of the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personendaten</em>' containment reference.
	 * @see #setPersonendaten(PersonendatenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType_Personendaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personendaten' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getPersonendaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getPersonendaten <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personendaten</em>' containment reference.
	 * @see #getPersonendaten()
	 * @generated
	 */
	void setPersonendaten(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Geburtsdatum
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtOptionalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtOptionalType value);

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Staatsangehörigkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #setStaatsangehoerigkeit(CodeStaatsangehoerigkeitType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType_Staatsangehoerigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatsangehoerigkeitType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(CodeStaatsangehoerigkeitType value);

	/**
	 * Returns the value of the '<em><b>Einstellung Adoptionsabsicht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wie steht der abgebende Elternteil zur Adoptionsabsicht?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einstellung Adoptionsabsicht</em>' attribute.
	 * @see #setEinstellungAdoptionsabsicht(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType_EinstellungAdoptionsabsicht()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='einstellungAdoptionsabsicht' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEinstellungAdoptionsabsicht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getEinstellungAdoptionsabsicht <em>Einstellung Adoptionsabsicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einstellung Adoptionsabsicht</em>' attribute.
	 * @see #getEinstellungAdoptionsabsicht()
	 * @generated
	 */
	void setEinstellungAdoptionsabsicht(String value);

	/**
	 * Returns the value of the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein unsicherer Aufenthaltsstatus der Bewerbenden kann ein Indiz für sachfremde Motive für die gewünschte Adoption sein. Daher ist eine Abfrage erforderlich. Rechtsgrundlage: §§ 68 I Nr. 12, 60 ff. SGB I, §§ 7 I, II, 7e S. 1 Nr. 1, 9e AdVermiG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltsstatus</em>' containment reference.
	 * @see #setAufenthaltsstatus(CodeAufenthaltsstatusType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType_Aufenthaltsstatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aufenthaltsstatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAufenthaltsstatusType getAufenthaltsstatus();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthaltsstatus</em>' containment reference.
	 * @see #getAufenthaltsstatus()
	 * @generated
	 */
	void setAufenthaltsstatus(CodeAufenthaltsstatusType value);

	/**
	 * Returns the value of the '<em><b>Elternteil Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Falls verstorben, bitte Sterbedatum eintragen. Falls ein abgebender Elternteil bereits verstorben ist, ist die Beratungspflicht nach § 9a I Nr. 1 nicht mehr umsetzbar und daher nicht mehr von Bedeutung. Rechtsgrundlage: §§ 68 I Nr. 12, 60 ff. SGB I, §§ 7 I, II, 7e S. 1 Nr. 1, 9a I, 9e AdVermiG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elternteil Verstorben</em>' containment reference.
	 * @see #setElternteilVerstorben(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAbgebenderElternteilType_ElternteilVerstorben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elternteilVerstorben' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getElternteilVerstorben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType#getElternteilVerstorben <em>Elternteil Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elternteil Verstorben</em>' containment reference.
	 * @see #getElternteilVerstorben()
	 * @generated
	 */
	void setElternteilVerstorben(TeilbekanntesDatumType value);

} // AbgebenderElternteilType
