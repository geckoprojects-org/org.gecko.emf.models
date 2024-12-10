/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package ee.jakarta.xml.ns.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *                 Configuration of a persistence unit.
 * 
 *               
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getDescription <em>Description</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProvider <em>Provider</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getScope <em>Scope</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getJtaDataSource <em>Jta Data Source</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getNonJtaDataSource <em>Non Jta Data Source</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getMappingFile <em>Mapping File</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getJarFile <em>Jar File</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getClass_ <em>Class</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#isExcludeUnlistedClasses <em>Exclude Unlisted Classes</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getSharedCacheMode <em>Shared Cache Mode</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getValidationMode <em>Validation Mode</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProperties <em>Properties</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getAny <em>Any</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getTransactionType <em>Transaction Type</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType()
 * @model extendedMetaData="name='persistence-unit_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PersistenceUnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     Description of this persistence unit.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     Provider class that supplies EntityManagers for this
	 *                     persistence unit.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Provider()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     Qualifier annotation class used for dependency injection.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute list.
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Qualifier()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='qualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getQualifier();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     Scope annotation class used for dependency injection.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Scope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Jta Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     The container-specific name of the JTA datasource to use.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jta Data Source</em>' attribute.
	 * @see #setJtaDataSource(String)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_JtaDataSource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='jta-data-source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJtaDataSource();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getJtaDataSource <em>Jta Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jta Data Source</em>' attribute.
	 * @see #getJtaDataSource()
	 * @generated
	 */
	void setJtaDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Non Jta Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     The container-specific name of a non-JTA datasource to use.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Jta Data Source</em>' attribute.
	 * @see #setNonJtaDataSource(String)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_NonJtaDataSource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='non-jta-data-source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNonJtaDataSource();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getNonJtaDataSource <em>Non Jta Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Jta Data Source</em>' attribute.
	 * @see #getNonJtaDataSource()
	 * @generated
	 */
	void setNonJtaDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Mapping File</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     File containing mapping information. Loaded as a resource
	 *                     by the persistence provider.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping File</em>' attribute list.
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_MappingFile()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='mapping-file' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getMappingFile();

	/**
	 * Returns the value of the '<em><b>Jar File</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     Jar file that is to be scanned for managed classes.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jar File</em>' attribute list.
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_JarFile()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='jar-file' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getJarFile();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     Managed class to be included in the persistence unit and
	 *                     to scan for annotations.  It should be annotated
	 *                     with either @Entity, @Embeddable or @MappedSuperclass.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute list.
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Class()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getClass_();

	/**
	 * Returns the value of the '<em><b>Exclude Unlisted Classes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     When set to true then only listed classes and jars will
	 *                     be scanned for persistent classes, otherwise the
	 *                     enclosing jar or directory will also be scanned.
	 *                     Not applicable to Java SE persistence units.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Unlisted Classes</em>' attribute.
	 * @see #isSetExcludeUnlistedClasses()
	 * @see #unsetExcludeUnlistedClasses()
	 * @see #setExcludeUnlistedClasses(boolean)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_ExcludeUnlistedClasses()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='exclude-unlisted-classes' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExcludeUnlistedClasses();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#isExcludeUnlistedClasses <em>Exclude Unlisted Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Unlisted Classes</em>' attribute.
	 * @see #isSetExcludeUnlistedClasses()
	 * @see #unsetExcludeUnlistedClasses()
	 * @see #isExcludeUnlistedClasses()
	 * @generated
	 */
	void setExcludeUnlistedClasses(boolean value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#isExcludeUnlistedClasses <em>Exclude Unlisted Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExcludeUnlistedClasses()
	 * @see #isExcludeUnlistedClasses()
	 * @see #setExcludeUnlistedClasses(boolean)
	 * @generated
	 */
	void unsetExcludeUnlistedClasses();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#isExcludeUnlistedClasses <em>Exclude Unlisted Classes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exclude Unlisted Classes</em>' attribute is set.
	 * @see #unsetExcludeUnlistedClasses()
	 * @see #isExcludeUnlistedClasses()
	 * @see #setExcludeUnlistedClasses(boolean)
	 * @generated
	 */
	boolean isSetExcludeUnlistedClasses();

	/**
	 * Returns the value of the '<em><b>Shared Cache Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     Defines whether caching is enabled for the
	 *                     persistence unit if caching is supported by the
	 *                     persistence provider. When set to ALL, all entities
	 *                     will be cached. When set to NONE, no entities will
	 *                     be cached. When set to ENABLE_SELECTIVE, only entities
	 *                     specified as cacheable will be cached. When set to
	 *                     DISABLE_SELECTIVE, entities specified as not cacheable
	 *                     will not be cached. When not specified or when set to
	 *                     UNSPECIFIED, provider defaults may apply.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shared Cache Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
	 * @see #isSetSharedCacheMode()
	 * @see #unsetSharedCacheMode()
	 * @see #setSharedCacheMode(PersistenceUnitCachingType)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_SharedCacheMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='shared-cache-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	PersistenceUnitCachingType getSharedCacheMode();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getSharedCacheMode <em>Shared Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Cache Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitCachingType
	 * @see #isSetSharedCacheMode()
	 * @see #unsetSharedCacheMode()
	 * @see #getSharedCacheMode()
	 * @generated
	 */
	void setSharedCacheMode(PersistenceUnitCachingType value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getSharedCacheMode <em>Shared Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSharedCacheMode()
	 * @see #getSharedCacheMode()
	 * @see #setSharedCacheMode(PersistenceUnitCachingType)
	 * @generated
	 */
	void unsetSharedCacheMode();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getSharedCacheMode <em>Shared Cache Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shared Cache Mode</em>' attribute is set.
	 * @see #unsetSharedCacheMode()
	 * @see #getSharedCacheMode()
	 * @see #setSharedCacheMode(PersistenceUnitCachingType)
	 * @generated
	 */
	boolean isSetSharedCacheMode();

	/**
	 * Returns the value of the '<em><b>Validation Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     The validation mode to be used for the persistence unit.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
	 * @see #isSetValidationMode()
	 * @see #unsetValidationMode()
	 * @see #setValidationMode(PersistenceUnitValidationModeType)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_ValidationMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='validation-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	PersistenceUnitValidationModeType getValidationMode();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getValidationMode <em>Validation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Mode</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitValidationModeType
	 * @see #isSetValidationMode()
	 * @see #unsetValidationMode()
	 * @see #getValidationMode()
	 * @generated
	 */
	void setValidationMode(PersistenceUnitValidationModeType value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getValidationMode <em>Validation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidationMode()
	 * @see #getValidationMode()
	 * @see #setValidationMode(PersistenceUnitValidationModeType)
	 * @generated
	 */
	void unsetValidationMode();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getValidationMode <em>Validation Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Validation Mode</em>' attribute is set.
	 * @see #unsetValidationMode()
	 * @see #getValidationMode()
	 * @see #setValidationMode(PersistenceUnitValidationModeType)
	 * @generated
	 */
	boolean isSetValidationMode();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                     A list of standard and vendor-specific properties
	 *                     and hints.
	 * 
	 *                   
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                       An extension point for integration related configuration, e.g. cdi:
	 *                     
	 *   <!--
	 *                     <persistence-unit name="my-unit" xmlns:cdi="https://jakarta.ee/xml/ns/persistence-cdi">
	 *                       ...
	 *                       <cdi:scope>com.example.jpa.ACustomScope</cdi:scope>
	 *                       <cdi:qualifier>com.example.jpa.CustomQualifier</cdi:qualifier>
	 *                     </persistence-unit>
	 *                     -->
	 *                     
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                   Name used in code to reference this persistence unit.
	 * 
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *                   Type of transactions used by EntityManagers from this
	 *                   persistence unit.
	 * 
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
	 * @see #isSetTransactionType()
	 * @see #unsetTransactionType()
	 * @see #setTransactionType(PersistenceUnitTransactionType)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceUnitType_TransactionType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transaction-type'"
	 * @generated
	 */
	PersistenceUnitTransactionType getTransactionType();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see ee.jakarta.xml.ns.persistence.PersistenceUnitTransactionType
	 * @see #isSetTransactionType()
	 * @see #unsetTransactionType()
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(PersistenceUnitTransactionType value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionType()
	 * @see #getTransactionType()
	 * @see #setTransactionType(PersistenceUnitTransactionType)
	 * @generated
	 */
	void unsetTransactionType();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceUnitType#getTransactionType <em>Transaction Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction Type</em>' attribute is set.
	 * @see #unsetTransactionType()
	 * @see #getTransactionType()
	 * @see #setTransactionType(PersistenceUnitTransactionType)
	 * @generated
	 */
	boolean isSetTransactionType();

} // PersistenceUnitType
