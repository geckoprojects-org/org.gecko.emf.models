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
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Des Zu Adoptierenden Kindes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben des zu adoptierenden Kindes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getReligionszugehoerigkeit <em>Religionszugehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#isAusAuslandGeholt <em>Aus Ausland Geholt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType()
 * @model extendedMetaData="name='AngabenDesZuAdoptierendenKindesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenDesZuAdoptierendenKindesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Personendaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personendaten</em>' containment reference.
	 * @see #setPersonendaten(PersonendatenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType_Personendaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='personendaten' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getPersonendaten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getPersonendaten <em>Personendaten</em>}' containment reference.
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
	 * Angaben zu Geburtsdatum und Geburtsort
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtOptionalType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtOptionalType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getGeburt <em>Geburt</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType_Staatsangehoerigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatsangehoerigkeitType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(CodeStaatsangehoerigkeitType value);

	/**
	 * Returns the value of the '<em><b>Religionszugehoerigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Religionszugehörigkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Religionszugehoerigkeit</em>' attribute.
	 * @see #setReligionszugehoerigkeit(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType_Religionszugehoerigkeit()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='religionszugehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReligionszugehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getReligionszugehoerigkeit <em>Religionszugehoerigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Religionszugehoerigkeit</em>' attribute.
	 * @see #getReligionszugehoerigkeit()
	 * @generated
	 */
	void setReligionszugehoerigkeit(String value);

	/**
	 * Returns the value of the '<em><b>Aus Ausland Geholt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wurde das Kind innerhalb von zwei Jahren vor der Antragstellung aus dem Ausland nach Deutschland geholt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aus Ausland Geholt</em>' attribute.
	 * @see #isSetAusAuslandGeholt()
	 * @see #unsetAusAuslandGeholt()
	 * @see #setAusAuslandGeholt(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType_AusAuslandGeholt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ausAuslandGeholt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAusAuslandGeholt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#isAusAuslandGeholt <em>Aus Ausland Geholt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aus Ausland Geholt</em>' attribute.
	 * @see #isSetAusAuslandGeholt()
	 * @see #unsetAusAuslandGeholt()
	 * @see #isAusAuslandGeholt()
	 * @generated
	 */
	void setAusAuslandGeholt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#isAusAuslandGeholt <em>Aus Ausland Geholt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAusAuslandGeholt()
	 * @see #isAusAuslandGeholt()
	 * @see #setAusAuslandGeholt(boolean)
	 * @generated
	 */
	void unsetAusAuslandGeholt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#isAusAuslandGeholt <em>Aus Ausland Geholt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aus Ausland Geholt</em>' attribute is set.
	 * @see #unsetAusAuslandGeholt()
	 * @see #isAusAuslandGeholt()
	 * @see #setAusAuslandGeholt(boolean)
	 * @generated
	 */
	boolean isSetAusAuslandGeholt();

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu Straße, Hausnummer, PLZ und Wohnort
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(MeldeanschriftType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType_Anschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	MeldeanschriftType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(MeldeanschriftType value);

	/**
	 * Returns the value of the '<em><b>Aufenthaltsstatus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein unsicherer Aufenthaltsstatus der Bewerbenden kann ein Indiz für sachfremde Motive für die gewünschte Adoption sein. Daher ist eine Abfrage erforderlich. Rechtsgrundlage: §§ 68 I Nr. 12, 60 ff. SGB I, §§ 7 I, II, 7e S. 1 Nr. 1, 9e AdVermiG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltsstatus</em>' containment reference.
	 * @see #setAufenthaltsstatus(CodeAufenthaltsstatusType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAngabenDesZuAdoptierendenKindesType_Aufenthaltsstatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aufenthaltsstatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeAufenthaltsstatusType getAufenthaltsstatus();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufenthaltsstatus</em>' containment reference.
	 * @see #getAufenthaltsstatus()
	 * @generated
	 */
	void setAufenthaltsstatus(CodeAufenthaltsstatusType value);

} // AngabenDesZuAdoptierendenKindesType
